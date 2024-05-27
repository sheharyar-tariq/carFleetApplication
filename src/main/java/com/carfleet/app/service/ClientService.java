package com.carfleet.app.service;

import com.carfleet.app.dao.ClientRepository;
import com.carfleet.app.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getClients(){
        List<Client> clients = clientRepository.findAll();
        return clients;
    }
    public void SaveClient(Client client){
        clientRepository.save(client);
    }
    public Optional<Client> findById(int clientId){
        return clientRepository.findById(clientId);
    }
    public void DeleteClient(int clientId){
        clientRepository.deleteById(clientId);
    }

}
