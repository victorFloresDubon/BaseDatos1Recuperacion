package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Municipio;
import umg.bd1.proyectofinal.model.key.MunicipioId;
import umg.bd1.proyectofinal.repositorio.MunicipioRepository;

@Service
public class MunicipioServiceImp extends GenericServiceImp<Municipio, MunicipioId> implements MunicipioService{

    @Autowired
    MunicipioRepository municipioRepository;

    @Override
    public CrudRepository<Municipio, MunicipioId> getRepository() {
        return municipioRepository;
    }
}
