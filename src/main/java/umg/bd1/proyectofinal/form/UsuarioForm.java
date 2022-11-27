package umg.bd1.proyectofinal.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioForm {

    private Long id;
    private String nombre;
    private String password;
    private Long idRol;
}
