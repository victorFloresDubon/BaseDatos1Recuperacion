package umg.bd1.proyectofinal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import umg.bd1.proyectofinal.model.Rol;
import umg.bd1.proyectofinal.service.RolService;

@Controller
public class RolController {

    @Autowired
    RolService rolService;

    @GetMapping("/roles")
    public String getRoles(Model modelo){
        modelo.addAttribute("roles", rolService.getAll());
        return "administracion/rol/roles";
    }

    @GetMapping("/roles/nuevo")
    public String getCrearRolForm(Model modelo){
        Rol rol = new Rol();
        modelo.addAttribute("rol", rol);
        return "administracion/rol/crear-rol";
    }

    @PostMapping("/roles")
    public String save(@ModelAttribute("rol") Rol rol){
        rolService.save(rol);
        return "redirect:/roles";
    }

    @GetMapping("/roles/editar")
    public String getEditRol(@RequestParam(name = "id") Long id, Model modelo){
        modelo.addAttribute("id", id);
        modelo.addAttribute("rol", rolService.get(id));
        return "administracion/rol/edit-rol";
    }

    @PostMapping("/roles/edit")
    public String update(@RequestParam(name = "id") Long id, @ModelAttribute(name = "rol") Rol rol, Model modelo){
        Rol rolExistente = rolService.get(id);
        rolExistente.setId(id);
        rolExistente.setDescripcion(rol.getDescripcion());
        //rolExistente.setOpciones(rol.getOpciones());
        rolService.save(rolExistente);
        return "redirect:/roles";
    }

    @GetMapping("/roles/borrar")
    public String delete(@RequestParam(name = "id") Long id){
        rolService.delete(id);
        return "redirect:/roles";
    }

}
