package umg.bd1.proyectofinal.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import umg.bd1.proyectofinal.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query(
            nativeQuery = true,
            value = "SELECT utl_seguridad.decodificar(password) FROM usuario WHERE id = :id"
    )
    String getUsuarioPasswordDecodificada(@Param("id") Long id);
    boolean existsUsuarioByNombre(String nombre);

    Optional<Usuario> findUsuarioByNombre(String nombre);

}
