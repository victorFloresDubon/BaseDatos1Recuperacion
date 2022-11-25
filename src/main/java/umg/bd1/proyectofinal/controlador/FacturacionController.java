package umg.bd1.proyectofinal.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import umg.bd1.proyectofinal.model.Transaccion;
import umg.bd1.proyectofinal.model.TransaccionDetalle;
import umg.bd1.proyectofinal.service.*;

import java.util.ArrayList;

@Controller
public class FacturacionController {


    @Autowired ClienteService clienteService;
    @Autowired TransaccionService transaccionService;
    @Autowired TipoTransaccionInventarioService tipoTransaccionInventarioService;
    @Autowired EmpleadoService empleadoService;
    @Autowired EstadoOrdenService estadoOrdenService;
    @Autowired SucursalService sucursalService;

    @GetMapping("/facturacion/factura")
    public String getFormularioFactura(Model modelo, @ModelAttribute(name = "factura") Transaccion facturaActual){
        // Si no hay un documento actual entonces se carga la información inicial
        if(facturaActual == null) {
            Transaccion factura = new Transaccion();
            modelo.addAttribute("factura", factura);
            // Campos del formulario
            modelo.addAttribute("cliente", 0);
            modelo.addAttribute("sucursal", 0);
            modelo.addAttribute("tipoTransaccion", 0);
            modelo.addAttribute("empleado", 0);
            modelo.addAttribute("estadoOrden", 0);

            // Listado de sucursal
            modelo.addAttribute("sucursales", sucursalService.getAll());
            modelo.addAttribute("clientes", clienteService.getAll());
            modelo.addAttribute("tipoTransacciones", tipoTransaccionInventarioService.getAll());
            modelo.addAttribute("empleados", empleadoService.getAll());
            modelo.addAttribute("estadosOrdenes", estadoOrdenService.getAll());
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
