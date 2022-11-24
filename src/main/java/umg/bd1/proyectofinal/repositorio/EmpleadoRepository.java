package umg.bd1.proyectofinal.repositorio;

import org.springframework.data.repository.CrudRepository;
import umg.bd1.proyectofinal.model.Empleado;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
}
