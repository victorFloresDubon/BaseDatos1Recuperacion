package umg.bd1.proyectofinal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import umg.bd1.proyectofinal.model.TipoPago;
import umg.bd1.proyectofinal.service.TipoPagoService;

@Controller
public class TipoPagoController {

    @Autowired
    TipoPagoService TipoPagoService;

    @GetMapping("/catalogos/tipo-pago")
    public String getTiposPago(Model modelo) {
        modelo.addAttribute("tiposPago", TipoPagoService.getAll());
        return "catalogos/Tipo_Pago/tipo-pago";
    }

    @GetMapping("/catalogos/tipo-pago/nuevo")
    public String getCrearTipoPagoForm(Model modelo) {
        TipoPago TipoPago = new TipoPago();
        modelo.addAttribute("TipoPago", TipoPago);
        return "catalogos/Tipo_Pago/crear-tipo-pago";
    }

    @PostMapping("/catalogos/tipo-pago")
    public String save(@ModelAttribute("TipoPago") TipoPago TipoPago) {
        TipoPagoService.save(TipoPago);
        return "redirect:/catalogos/tipo-pago";
    }

    @GetMapping("/catalogos/tipo-pago/editar")
    public String getEditTipoPago(@RequestParam(name = "id") Long id, Model modelo) {
        modelo.addAttribute("id", id);
        modelo.addAttribute("tipoPago", TipoPagoService.get(id));
        return "catalogos/Tipo_Pago/edit-tipo-pago";
    }

    @PostMapping("/catalogos/tipo-pago/edit")
    public String update(
            @RequestParam(name = "id") Long id,
            @ModelAttribute(name = "TipoPago") TipoPago TipoPago,
            Model modelo
    ) {
        TipoPago TipoPagoExist = TipoPagoService.get(id);
        TipoPagoExist.setId(id);
        TipoPagoExist.setDescripcion(TipoPago.getDescripcion());
        TipoPagoService.save(TipoPagoExist);
        return "redirect:/catalogos/tipo-pago";
    }

    @GetMapping("/catalogos/tipo-pago/borrar")
    public String delete(@RequestParam(name = "id") Long id) {
        TipoPagoService.delete(id);
        return "redirect:/catalogos/tipo-pago";
    }

}
