package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Zona;
import umg.bd1.proyectofinal.model.key.ZonaId;
import umg.bd1.proyectofinal.repositorio.ZonaRepository;

@Service
public class ZonaServiceImp extends GenericServiceImp<Zona, ZonaId> implements ZonaService {

    @Autowired
    ZonaRepository zonaRepository;

    @Override
    public CrudRepository<Zona, ZonaId> getRepository() {
        return zonaRepository;
    }
}
