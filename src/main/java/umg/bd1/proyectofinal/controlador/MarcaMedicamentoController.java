package umg.bd1.proyectofinal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import umg.bd1.proyectofinal.model.MarcaMedicamento;
import umg.bd1.proyectofinal.repositorio.MarcaMedicamentoRepository;

@Controller
public class MarcaMedicamentoController {

    @Autowired
    MarcaMedicamentoRepository marcaMedicamentoRepository;

    @GetMapping("/marcamedicamento")
    public String getMarcaMedicamento(){
        return "catalogos/add-marca-medicamento";
    }

    @PostMapping("/add")
    public String crear(MarcaMedicamento marcaMedicamento, BindingResult result, Model model){
        if(result.hasErrors()){
            return "add-marca-medicamento";
        }

        marcaMedicamentoRepository.save(marcaMedicamento);
        return "redirect:/";
    }
}
