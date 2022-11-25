package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.TipoTransaccionInventario;
import umg.bd1.proyectofinal.repositorio.TipoTransaccionInventarioRepo;

@Service
public class TipoTransaccionInventarioServiceImp extends GenericServiceImp<TipoTransaccionInventario, Long> implements TipoTransaccionInventarioService {

    @Autowired
    TipoTransaccionInventarioRepo tipoTransaccionInventarioRepo;

    @Override
    public CrudRepository<TipoTransaccionInventario, Long> getRepository() {
        return tipoTransaccionInventarioRepo;
    }
}
