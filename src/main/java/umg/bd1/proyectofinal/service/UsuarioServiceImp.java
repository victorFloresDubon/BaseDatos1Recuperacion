package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Usuario;
import umg.bd1.proyectofinal.repositorio.UsuarioRepository;

import java.util.Optional;

@Service
public class UsuarioServiceImp extends GenericServiceImp<Usuario, Long> implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public CrudRepository<Usuario, Long> getRepository() {
        return usuarioRepository;
    }

    @Override
    public String getUsuarioPasswordDecodificada(Long id) {
        return usuarioRepository.getUsuarioPasswordDecodificada(id);
    }

    @Override
    public boolean existsUsuarioByNombre(String nombre) {
        return usuarioRepository.existsUsuarioByNombre(nombre);
    }

    @Override
    public Optional<Usuario> findUsuarioByNombre(String nombre) {
        return usuarioRepository.findUsuarioByNombre(nombre);
    }
}
