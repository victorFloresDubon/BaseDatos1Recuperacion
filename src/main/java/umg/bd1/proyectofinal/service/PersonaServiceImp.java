package umg.bd1.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import umg.bd1.proyectofinal.common.GenericServiceImp;
import umg.bd1.proyectofinal.model.Persona;
import umg.bd1.proyectofinal.repositorio.PersonaRepository;

@Service
public class PersonaServiceImp extends GenericServiceImp<Persona, Long> implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public CrudRepository<Persona, Long> getRepository() {
        return personaRepository;
    }
}
