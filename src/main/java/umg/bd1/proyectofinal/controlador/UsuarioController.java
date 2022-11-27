package umg.bd1.proyectofinal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import umg.bd1.proyectofinal.form.LoginForm;
import umg.bd1.proyectofinal.form.UsuarioForm;
import umg.bd1.proyectofinal.model.Rol;
import umg.bd1.proyectofinal.model.Usuario;
import umg.bd1.proyectofinal.service.RolService;
import umg.bd1.proyectofinal.service.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    @Autowired
    RolService rolService;

    @GetMapping("/crear/usuarios")
    public String getUsuarios(Model modelo){
        modelo.addAttribute("usuarios", usuarioService.getAll());
        return "administracion/Usuario/usuarios";
    }

    @GetMapping("/crear/usuarios/nuevo")
    public String getCrearUsuarioForm(Model modelo){
        UsuarioForm usuario = new UsuarioForm();
        modelo.addAttribute("usuario", usuario);
        modelo.addAttribute("roles", rolService.getAll());
        return "administracion/Usuario/crear-usuario";
    }

    @PostMapping("/crear/usuarios/save")
    public String save(@ModelAttribute("usuario") UsuarioForm form){
        Usuario usuario = new Usuario();
        usuario.setNombre(form.getNombre());
        usuario.setPassword(form.getPassword());

        Rol rol = rolService.get(form.getIdRol());
        usuario.addRol(rol);

        usuarioService.save(usuario);
        return "redirect:/crear/usuarios";
    }

    @GetMapping("/crear/usuarios/editar")
    public String getEditUsuario(@RequestParam(name = "id") Long id, Model modelo){
        modelo.addAttribute("id", id);
        modelo.addAttribute("usuario", usuarioService.get(id));
        return "administracion/Usuario/edit-usuario";
    }

    @PostMapping("/crear/usuarios/update")
    public String update(
            @RequestParam(name = "id") Long id,
            @ModelAttribute(name = "usuario") UsuarioForm form,
            Model modelo
    ){
        Usuario usuarioExistente = usuarioService.get(form.getId());
        usuarioExistente.setId(id);
        usuarioExistente.setNombre(form.getNombre());
        usuarioExistente.setPassword(form.getPassword());
        usuarioExistente.setRoles(usuarioExistente.getRoles());
        usuarioService.save(usuarioExistente);
        return "redirect:/crear/usuarios";
    }

    @GetMapping("/crear/usuarios/delete")
    public String delete(@RequestParam(name = "id") Long id){
        usuarioService.delete(id);
        return "redirect:/crear/usuarios";
    }

    @GetMapping("/login")
    public String getLoginForm(Model modelo){
        modelo.addAttribute("login", new LoginForm());
        return "Login/index";
    }

    @PostMapping("/login")
    public String getLoginForm(@ModelAttribute("login") LoginForm loginForm){
        // Si el usuario existe por nombre se validará la contraseña
        if(usuarioService.existsUsuarioByNombre(loginForm.getNombre())){
            Usuario usuario = usuarioService.findUsuarioByNombre(loginForm.getNombre()).get();
            if(loginForm.getPassword().equals(usuarioService.getUsuarioPasswordDecodificada(usuario.getId()))){
                return "redirect:menu";
            }
            return "redirect:login";
        }
        return "redirect:login";
    }
}
