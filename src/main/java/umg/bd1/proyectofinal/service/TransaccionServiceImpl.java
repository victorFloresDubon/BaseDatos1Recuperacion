package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Transaccion;
import umg.bd1.proyectofinal.repositorio.TransaccionRepository;

@Service
public class TransaccionServiceImpl extends GenericServiceImp<Transaccion, Long> implements TransaccionService {

    @Autowired
    TransaccionRepository transaccionRepository;

    @Override
    public CrudRepository<Transaccion, Long> getRepository() {
        return transaccionRepository;
    }
}
