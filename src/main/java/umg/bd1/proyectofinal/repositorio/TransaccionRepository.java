package umg.bd1.proyectofinal.repositorio;

import org.springframework.data.repository.CrudRepository;
import umg.bd1.proyectofinal.model.Transaccion;

public interface TransaccionRepository extends CrudRepository<Transaccion, Long> {
}
