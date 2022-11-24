package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Rol;
import umg.bd1.proyectofinal.repositorio.RolRepository;

@Service
public class RolServiceImp extends GenericServiceImp<Rol, Long> implements RolService {

    @Autowired
    RolRepository rolRepository;

    @Override
    public CrudRepository<Rol, Long> getRepository() {
        return rolRepository;
    }

}
