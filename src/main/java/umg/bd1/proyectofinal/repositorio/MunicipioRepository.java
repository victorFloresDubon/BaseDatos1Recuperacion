package umg.bd1.proyectofinal.repositorio;

import org.springframework.data.repository.CrudRepository;
import umg.bd1.proyectofinal.model.Municipio;
import umg.bd1.proyectofinal.model.key.MunicipioId;

public interface MunicipioRepository extends CrudRepository<Municipio, MunicipioId> {
}
