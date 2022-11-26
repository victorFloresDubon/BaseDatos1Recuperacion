package umg.bd1.proyectofinal.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/menu")
    public String getMenu() {
        return "administracion/Menu/menu";
    }
}
