package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Empleado;
import umg.bd1.proyectofinal.repositorio.EmpleadoRepository;

@Service
public class EmpleadoServiceImp extends GenericServiceImp<Empleado, Long> implements EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public CrudRepository<Empleado, Long> getRepository() {
        return empleadoRepository;
    }
}
