package umg.bd1.proyectofinal.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FacturacionController {

    @GetMapping("/facturacion/factura")
    public String getFormularioFactura(Model modelo){
        return "Facturacion/crear-facturacion";
    }
}
