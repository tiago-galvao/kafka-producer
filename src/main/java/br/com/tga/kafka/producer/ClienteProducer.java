package br.com.tga.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClienteProducer {
    
    @Autowired
    private KafkaTemplate<String, Client> producer;

    public void enviarParaFila(Client client){
        producer.send("spec2-tiago-galvao-2", client);
    }
}