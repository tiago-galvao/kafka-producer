package br.com.tga.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @Autowired
    private ClienteProducer clienteProducer;

    @PostMapping
    public void create(@RequestBody Client client){
        clienteProducer.enviarParaFila(client);
    }
}