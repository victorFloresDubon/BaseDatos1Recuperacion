package umg.bd1.proyectofinal.model.key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRolId implements Serializable {

    @Column(name = "ID_USUARIO")
    private Long usuarioId;

    @Column(name = "ID_ROL")
    private Long rolId;

}
