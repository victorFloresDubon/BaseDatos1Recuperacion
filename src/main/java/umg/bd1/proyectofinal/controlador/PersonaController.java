package umg.bd1.proyectofinal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import umg.bd1.proyectofinal.model.Persona;
import umg.bd1.proyectofinal.repositorio.PersonaRepository;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaRepository personaRepository;

    public String crear(Model model, BindingResult result, Persona persona){
        if(result.hasErrors()){
            return "add-persona";
        }

        personaRepository.save(persona);
        return "redirect:/index";

    }
}
