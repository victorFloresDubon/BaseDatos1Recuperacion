package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.EstadoOrden;
import umg.bd1.proyectofinal.repositorio.EstadoOrdenRepository;

public class EstadoOrdenServiceImp extends GenericServiceImp<EstadoOrden, Long> implements EstadoOrdenService {

    @Autowired
    EstadoOrdenRepository estadoOrdenRepository;

    @Override
    public CrudRepository<EstadoOrden, Long> getRepository() {
        return estadoOrdenRepository;
    }


}
