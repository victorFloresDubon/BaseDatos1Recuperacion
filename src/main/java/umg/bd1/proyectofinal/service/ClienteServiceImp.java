package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Cliente;
import umg.bd1.proyectofinal.repositorio.ClienteRepository;

@Service
public class ClienteServiceImp extends GenericServiceImp<Cliente, Long> implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public CrudRepository<Cliente, Long> getRepository() {
        return clienteRepository;
    }
}
