package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Departamento;
import umg.bd1.proyectofinal.model.key.DepartamentoId;
import umg.bd1.proyectofinal.repositorio.DepartamentoRepository;

@Service
public class DepartamentoServiceImp extends GenericServiceImp<Departamento, DepartamentoId> implements DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    @Override
    public CrudRepository<Departamento, DepartamentoId> getRepository() {
        return departamentoRepository;
    }
}
