package umg.bd1.proyectofinal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import umg.bd1.proyectofinal.model.TipoMedicamento;
import umg.bd1.proyectofinal.service.TipoMedicamentoService;

@Controller
public class TipoMedicamentoController {

    @Autowired
    TipoMedicamentoService tipoMedicamentoService;

    @GetMapping("/catalogos/tipo-medicamento")
    public String getTiposMedicamento(Model modelo) {
        modelo.addAttribute("tiposMedicamento", tipoMedicamentoService.getAll());
        return "catalogos/Tipo_Medicamento/tipo-medicamento";
    }

    @GetMapping("/catalogos/tipo-medicamento/nuevo")
    public String getCrearTipoMedicamentoForm(Model modelo) {
        TipoMedicamento tipoMedicamento = new TipoMedicamento();
        modelo.addAttribute("tipoMedicamento", tipoMedicamento);
        return "catalogos/Tipo_Medicamento/crear-tipo-medicamento";
    }

    @PostMapping("/catalogos/tipo-medicamento")
    public String save(@ModelAttribute("tipoMedicamento") TipoMedicamento tipoMedicamento) {
        tipoMedicamentoService.save(tipoMedicamento);
        return "redirect:/catalogos/tipo-medicamento";
    }

    @GetMapping("/catalogos/tipo-medicamento/editar")
    public String getEditTipoMedicamento(@RequestParam(name = "id") Long id, Model modelo) {
        modelo.addAttribute("id", id);
        modelo.addAttribute("tipoMedicamento", tipoMedicamentoService.get(id));
        return "catalogos/edit-tipo-medicamento";
    }

    @PostMapping("/catalogos/tipo-medicamento/edit")
    public String update(
            @RequestParam(name = "id") Long id,
            @ModelAttribute(name = "tipoMedicamento") TipoMedicamento tipoMedicamento,
            Model modelo
    ) {
        TipoMedicamento tipoMedicamentoExist = tipoMedicamentoService.get(id);
        tipoMedicamentoExist.setId(id);
        tipoMedicamentoExist.setDescripcion(tipoMedicamento.getDescripcion());
        tipoMedicamentoService.save(tipoMedicamentoExist);
        return "redirect:catalogos/tipo-medicamento";
    }

    @GetMapping("/catalogos/tipo-medicamento/borrar")
    public String delete(@RequestParam(name = "id") Long id) {
        tipoMedicamentoService.delete(id);
        return "redirect:/catalogos/tipo-medicamento";
    }

}
