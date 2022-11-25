package umg.bd1.proyectofinal.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import umg.bd1.proyectofinal.model.Transaccion;
import umg.bd1.proyectofinal.model.TransaccionDetalle;

@Controller
public class FacturacionController {

    @GetMapping("/facturacion/factura")
    public String getFormularioFactura(Model modelo){
        // Si no hay un documento actual entonces se instancia
        if(modelo.getAttribute("factura") != null) {
            Transaccion factura = new Transaccion();
            modelo.addAttribute("factura", factura);
        }
        return "Facturacion/crear-facturacion";
    }

    @PostMapping("/facturacion")
    public String save(@ModelAttribute("factura") Transaccion factura){

        return "redirect:/facturacion/factura";
    }

    @PostMapping("/facturacion/additem")
    public String saveItem(@ModelAttribute(name = "detalle") TransaccionDetalle detalle, Model modelo){
        // Obtener el documento actual desde el modelo
        Transaccion factura = (Transaccion) modelo.getAttribute("factura");
        // Agregar el item a la lista de detalles
        factura.agregarItem(detalle);
        return "redirect:/facturacion/factura";
    }

}
