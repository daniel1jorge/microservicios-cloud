package com.danielsilva.clientes_crud.repositories;

import com.danielsilva.clientes_crud.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> searchByUsername (String username);
}
