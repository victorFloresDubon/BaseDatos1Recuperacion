package umg.bd1.proyectofinal.repositorio;

import org.springframework.data.repository.CrudRepository;
import umg.bd1.proyectofinal.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
