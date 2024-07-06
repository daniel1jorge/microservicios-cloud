package com.danielsilva.clientes_crud.services;

import com.danielsilva.clientes_crud.model.Client;

import java.util.List;

public interface ClientService {

    Client create(Client client);
    Client update(Client client, String userName);
    void delete(Client client, String userName);

    Client searhByUserName(String userName);
    List<Client> getAll();
}
