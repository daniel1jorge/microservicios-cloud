package com.danielsilva.clientes_crud.controller;

import com.danielsilva.clientes_crud.model.Client;
import com.danielsilva.clientes_crud.services.ClientService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "client")
public class ClientController {
    private final ClientService clientService;

    @Operation(summary = "save in DB a client from body")
    @PostMapping
    public ResponseEntity<Client> post(@RequestBody Client client){
        return ResponseEntity.created(
                URI.create(this.clientService.create(client).getUsername()))
                .build();
    }

    @Operation(summary = "GET client from DB with username")
    @GetMapping(path = "{username}")
    public ResponseEntity<Client> get(@PathVariable String username){
        return ResponseEntity.ok(this.clientService.searhByUserName(username));
    }

    @Operation(summary = "GET all client from DB")
    @GetMapping(path = "/all")
    public ResponseEntity<List> getAll(){
        return ResponseEntity.ok(this.clientService.getAll());
    }
}
