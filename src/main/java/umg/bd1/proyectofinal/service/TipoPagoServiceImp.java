package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.TipoPago;
import umg.bd1.proyectofinal.repositorio.TipoPagoRepository;

@Service
public class TipoPagoServiceImp extends GenericServiceImp<TipoPago, Long> implements TipoPagoService {

    @Autowired
    TipoPagoRepository tipoPagoRepository;

    @Override
    public CrudRepository<TipoPago, Long> getRepository() {
        return tipoPagoRepository;
    }
}
