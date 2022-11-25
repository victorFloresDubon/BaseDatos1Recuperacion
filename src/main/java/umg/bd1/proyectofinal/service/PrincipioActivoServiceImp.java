package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.PrincipioActivo;
import umg.bd1.proyectofinal.repositorio.PrincipioActivoRepository;

@Service
public class PrincipioActivoServiceImp extends GenericServiceImp<PrincipioActivo, Long> implements PrincipioActivoService {

    @Autowired
    PrincipioActivoRepository principioActivoRepository;

    @Override
    public CrudRepository<PrincipioActivo, Long> getRepository() {
        return principioActivoRepository;
    }
}
