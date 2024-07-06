package com.danielsilva.clientes_crud.services;

import com.danielsilva.clientes_crud.model.Client;
import com.danielsilva.clientes_crud.repositories.ClientRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
@AllArgsConstructor
public class ClientServiceImp  implements ClientService{

    private final ClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public Client update(Client client, String userName) {
        var clientUpdate = this.clientRepository.searchByUsername(userName)
                .orElseThrow(()-> new NoSuchElementException("client not found."));
        return this.clientRepository.save(clientUpdate);
    }

    @Override
    public void delete(Client client, String userName) {
        var clientUpdate = this.clientRepository.searchByUsername(userName)
                .orElseThrow(()-> new NoSuchElementException("client not found."));
//        this.clientRepository.delete(clientUpdate);
        this.clientRepository.deleteById (clientUpdate.getId());
    }

    @Override
    public Client searhByUserName(String userName) {
        return this.clientRepository.searchByUsername(userName)
                .orElseThrow(() -> new NoSuchElementException("User Not Found."));
    }

    @Override
    public List<Client> getAll() {
        return this.clientRepository.findAll();
    }
}
