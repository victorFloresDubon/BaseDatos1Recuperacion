package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.TipoLaboratorio;
import umg.bd1.proyectofinal.repositorio.TipoLaboratorioRepository;

@Service
public class TipoLaboratorioServiceImp extends GenericServiceImp<TipoLaboratorio, Long> implements TipoLaboratorioService {

    @Autowired
    TipoLaboratorioRepository tipoLaboratorioRepository;

    @Override
    public CrudRepository<TipoLaboratorio, Long> getRepository() {
        return tipoLaboratorioRepository;
    }
}
