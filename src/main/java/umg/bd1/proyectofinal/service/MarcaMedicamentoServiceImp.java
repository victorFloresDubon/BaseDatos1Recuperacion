package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.MarcaMedicamento;
import umg.bd1.proyectofinal.repositorio.MarcaMedicamentoRepository;

@Service
public class MarcaMedicamentoServiceImp extends GenericServiceImp<MarcaMedicamento, Long> implements MarcaMedicamentoService{

    @Autowired
    MarcaMedicamentoRepository marcaMedicamentoRepository;

    @Override
    public CrudRepository<MarcaMedicamento, Long> getRepository() {
        return marcaMedicamentoRepository;
    }
}
