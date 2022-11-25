package umg.bd1.proyectofinal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import umg.bd1.proyectofinal.model.EstadoOrden;
import umg.bd1.proyectofinal.service.EstadoOrdenService;

@Controller
public class EstadoOrdenController {

    @Autowired
    EstadoOrdenService estadoOrdenService;

    @GetMapping("/catalogos/estados-orden")
    public String getEstadosOrden(Model modelo) {
        modelo.addAttribute("estadosOrden", estadoOrdenService.getAll());
        return "catalogos/Estado_Orden/estados-orden";
    }

    @GetMapping("/catalogos/estados-orden/nuevo")
    public String getCrearEstadoOrdenForm(Model modelo) {
        EstadoOrden estadoOrden = new EstadoOrden();
        modelo.addAttribute("estadoOrden", estadoOrden);
        return "catalogos/Estado_Orden/crear-estados-orden";
    }

    @PostMapping("/catalogos/estados-orden")
    public String save(@ModelAttribute("estadoOrden") EstadoOrden estadoOrden) {
        estadoOrdenService.save(estadoOrden);
        return "redirect:/catalogos/estados-orden";
    }

    @GetMapping("/catalogos/estados-orden/editar")
    public String getEditEstadoOrden(@RequestParam(name = "id") Long id, Model modelo) {
        modelo.addAttribute("id", id);
        modelo.addAttribute("estadoOrden", estadoOrdenService.get(id));
        return "catalogos/Estado_Orden/edit-estados-orden";
    }

    @PostMapping("/catalogos/estados-orden/edit")
    public String update(
            @RequestParam(name = "id") Long id,
            @ModelAttribute(name = "estadoOrden") EstadoOrden estadoOrden,
            Model modelo
    ) {
        EstadoOrden estadoOrdenExist = estadoOrdenService.get(id);
        estadoOrdenExist.setId(id);
        estadoOrdenExist.setDescripcion(estadoOrden.getDescripcion());
        estadoOrdenService.save(estadoOrdenExist);
        return "redirect:/catalogos/estados-orden";
    }

    @GetMapping("/catalogos/estados-orden/borrar")
    public String delete(@RequestParam(name = "id") Long id) {
        estadoOrdenService.delete(id);
        return "redirect:/catalogos/estados-orden";
    }

}
