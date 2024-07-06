package com.danielsilva.clientes_crud.controller;

import com.danielsilva.clientes_crud.model.Client;
import com.danielsilva.clientes_crud.services.ClientService;
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

    @PostMapping
    public ResponseEntity<Client> post(@RequestBody Client client){
        return ResponseEntity.created(
                URI.create(this.clientService.create(client).getUsername()))
                .build();
    }

    @GetMapping(path = "{name}")
    public ResponseEntity<Client> get(@PathVariable String name){
        return ResponseEntity.ok(this.clientService.searhByUserName(name));
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List> getAll(){
        return ResponseEntity.ok(this.clientService.getAll());
    }
}
