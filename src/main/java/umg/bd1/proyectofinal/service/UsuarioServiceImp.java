package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Usuario;
import umg.bd1.proyectofinal.repositorio.UsuarioRepository;

public class UsuarioServiceImp extends GenericServiceImp<Usuario, Long> implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public CrudRepository<Usuario, Long> getRepository() {
        return usuarioRepository;
    }
}
