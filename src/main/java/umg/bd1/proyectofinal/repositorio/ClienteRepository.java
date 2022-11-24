package umg.bd1.proyectofinal.repositorio;

import org.springframework.data.repository.CrudRepository;
import umg.bd1.proyectofinal.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
