package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Sucursal;
import umg.bd1.proyectofinal.repositorio.SucursalRepository;

@Service
public class SucursalServiceImp extends GenericServiceImp<Sucursal, Long> implements SucursalService {

    @Autowired
    SucursalRepository sucursalRepository;

    @Override
    public CrudRepository<Sucursal, Long> getRepository() {
        return sucursalRepository;
    }
}
