package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.EstadoTracking;
import umg.bd1.proyectofinal.repositorio.EstadoTrackingRepository;

@Service
public class EstadoTrackingServiceImp extends GenericServiceImp<EstadoTracking, Long> implements EstadoTrackingService {

    @Autowired
    EstadoTrackingRepository estadoTrackingRepository;

    @Override
    public CrudRepository<EstadoTracking, Long> getRepository() {
        return estadoTrackingRepository;
    }
}
