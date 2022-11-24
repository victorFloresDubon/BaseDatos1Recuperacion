package umg.bd1.proyectofinal.repositorio;

import org.springframework.data.repository.CrudRepository;
import umg.bd1.proyectofinal.model.Departamento;
import umg.bd1.proyectofinal.model.key.DepartamentoId;

public interface DepartamentoRepository extends CrudRepository<Departamento, DepartamentoId> {
}
