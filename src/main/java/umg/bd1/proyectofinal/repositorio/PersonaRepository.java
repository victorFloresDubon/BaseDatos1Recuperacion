package umg.bd1.proyectofinal.repositorio;

import org.springframework.data.repository.CrudRepository;
import umg.bd1.proyectofinal.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
}
