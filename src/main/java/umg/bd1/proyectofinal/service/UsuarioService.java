package umg.bd1.proyectofinal.service;

import umg.bd1.proyectofinal.common.GenericService;
import umg.bd1.proyectofinal.model.Usuario;

import java.util.Optional;

public interface UsuarioService extends GenericService<Usuario, Long> {
    String getUsuarioPasswordDecodificada(Long id);
    boolean existsUsuarioByNombre(String nombre);
    Optional<Usuario> findUsuarioByNombre(String nombre);
}
