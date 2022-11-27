package umg.bd1.proyectofinal.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getIndex(Model model){
        return "redirect:/login";
    }

    @GetMapping("/menu")
    public String getMenu() {
        return "administracion/Menu/menu";
    }


}
