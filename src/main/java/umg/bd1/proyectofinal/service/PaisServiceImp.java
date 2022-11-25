package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Pais;
import umg.bd1.proyectofinal.repositorio.PaisRepository;

@Service
public class PaisServiceImp extends GenericServiceImp<Pais, String> implements PaisService{

    @Autowired
    PaisRepository paisRepository;

    @Override
    public CrudRepository<Pais, String> getRepository() {
        return paisRepository;
    }
}
