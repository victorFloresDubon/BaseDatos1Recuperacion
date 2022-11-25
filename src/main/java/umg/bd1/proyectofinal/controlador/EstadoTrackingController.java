package umg.bd1.proyectofinal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import umg.bd1.proyectofinal.model.EstadoTracking;
import umg.bd1.proyectofinal.service.EstadoTrackingService;

@Controller
public class EstadoTrackingController {

    @Autowired
    EstadoTrackingService estadoTrackingService;

    @GetMapping("/catalogos/estados-tracking")
    public String getEstadosTracking(Model modelo) {
        modelo.addAttribute("estadosTracking", estadoTrackingService.getAll());
        return "catalogos/Estado_Tracking/estados-tracking";
    }

    @GetMapping("/catalogos/estados-tracking/nuevo")
    public String getCrearEstadoTrackingForm(Model modelo) {
        EstadoTracking estadoTracking = new EstadoTracking();
        modelo.addAttribute("estadoTracking", estadoTracking);
        return "catalogos/Estado_Tracking/crear-estados-tracking";
    }

    @PostMapping("/catalogos/estados-tracking")
    public String save(@ModelAttribute("estadoTracking") EstadoTracking estadoTracking) {
        estadoTrackingService.save(estadoTracking);
        return "redirect:/catalogos/estados-tracking";
    }

    @GetMapping("/catalogos/estados-tracking/editar")
    public String getEditEstadoTracking(@RequestParam(name = "id") Long id, Model modelo) {
        modelo.addAttribute("id", id);
        modelo.addAttribute("estadoTracking", estadoTrackingService.get(id));
        return "catalogos/Estado_Tracking/edit-estados-tracking";
    }

    @PostMapping("/catalogos/estados-tracking/edit")
    public String update(
            @RequestParam(name = "id") Long id,
            @ModelAttribute(name = "estadoTracking") EstadoTracking estadoTracking,
            Model modelo
    ) {
        EstadoTracking estadoTrackingExist = estadoTrackingService.get(id);
        estadoTrackingExist.setId(id);
        estadoTrackingExist.setDescripcion(estadoTracking.getDescripcion());
        estadoTrackingService.save(estadoTrackingExist);
        return "redirect:/catalogos/estados-tracking";
    }

    @GetMapping("/catalogos/estados-tracking/borrar")
    public String delete(@RequestParam(name = "id") Long id) {
        estadoTrackingService.delete(id);
        return "redirect:/catalogos/estados-tracking";
    }

}
