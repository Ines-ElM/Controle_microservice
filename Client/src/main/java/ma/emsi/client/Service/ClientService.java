package ma.emsi.client.Service;

import lombok.RequiredArgsConstructor;
import lombok.RequiredArgsConstructor;
import ma.emsi.client.Model.Client;
import ma.emsi.client.Repository.ClientRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientsRepository;

    public void saveClient(Client Client) {
        clientsRepository.save(Client);
    }

    public List<Client> getAllClients() {
        return clientsRepository.findAll();
    }

    public Client getClientById(Integer id) {
        return clientsRepository.findById(id).orElseThrow(() -> new RuntimeException("Client not found"));
    }

}
