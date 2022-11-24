package umg.bd1.proyectofinal.repositorio;

import org.springframework.data.repository.CrudRepository;
import umg.bd1.proyectofinal.model.Zona;
import umg.bd1.proyectofinal.model.key.ZonaId;

public interface ZonaRepository extends CrudRepository<Zona, ZonaId> {
}
