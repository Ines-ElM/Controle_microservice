package ma.emsi.client.Controller;

import lombok.RequiredArgsConstructor;
import ma.emsi.client.Model.Client;
import ma.emsi.client.Repository.ClientRepository;
import ma.emsi.client.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientsService;

    @PostMapping
//    @RequestMapping(HttpStatus.SC_CREATED + "")
    public void save(@RequestBody Client clt) {
        clientsService.saveClient(clt);
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(clientsService.getAllClients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Integer id) {
        return ResponseEntity.ok(clientsService.getClientById(id));
    }


}