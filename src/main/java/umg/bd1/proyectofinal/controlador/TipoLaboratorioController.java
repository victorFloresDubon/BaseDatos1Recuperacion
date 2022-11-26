package umg.bd1.proyectofinal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import umg.bd1.proyectofinal.model.TipoLaboratorio;
import umg.bd1.proyectofinal.service.TipoLaboratorioService;

@Controller
public class TipoLaboratorioController {

    @Autowired
    TipoLaboratorioService tipoLaboratorioService;

    @GetMapping("/catalogos/tipo-laboratorio")
    public String getTiposLaboratorio(Model modelo) {
        modelo.addAttribute("tiposLaboratorio", tipoLaboratorioService.getAll());
        return "catalogos/Tipo_Laboratorio/tipo-laboratorio";
    }

    @GetMapping("/catalogos/tipo-laboratorio/nuevo")
    public String getCrearTipoLaboratorioForm(Model modelo) {
        TipoLaboratorio tipoLaboratorio = new TipoLaboratorio();
        modelo.addAttribute("tipoLaboratorio", tipoLaboratorio);
        return "catalogos/Tipo_Laboratorio/crear-tipo-laboratorio";
    }

    @PostMapping("/catalogos/tipo-laboratorio")
    public String save(@ModelAttribute("tipoLaboratorio") TipoLaboratorio tipoLaboratorio) {
        tipoLaboratorioService.save(tipoLaboratorio);
        return "redirect:/catalogos/tipo-laboratorio";
    }

    @GetMapping("/catalogos/tipo-laboratorio/editar")
    public String getEditTipoLaboratorio(@RequestParam(name = "id") Long id, Model modelo) {
        modelo.addAttribute("id", id);
        modelo.addAttribute("tipoLaboratorio", tipoLaboratorioService.get(id));
        return "catalogos/Tipo_Medicamento/edit-tipo-laboratorio";
    }

    @PostMapping("/catalogos/tipo-laboratorio/edit")
    public String update(
            @RequestParam(name = "id") Long id,
            @ModelAttribute(name = "tipoLaboratorio") TipoLaboratorio tipoLaboratorio,
            Model modelo
    ) {
        TipoLaboratorio tipoLaboratorioExist = tipoLaboratorioService.get(id);
        tipoLaboratorioExist.setId(id);
        tipoLaboratorioExist.setDescripcion(tipoLaboratorio.getDescripcion());
        tipoLaboratorioService.save(tipoLaboratorioExist);
        return "redirect:/catalogos/tipo-laboratorio";
    }

    @GetMapping("/catalogos/tipo-laboratorio/borrar")
    public String delete(@RequestParam(name = "id") Long id) {
        tipoLaboratorioService.delete(id);
        return "redirect:/catalogos/tipo-laboratorio";
    }

}
