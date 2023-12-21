package ma.emsi.client.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import ma.emsi.client.Model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
