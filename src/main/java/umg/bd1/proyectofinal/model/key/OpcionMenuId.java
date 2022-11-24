package umg.bd1.proyectofinal.model.key;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class OpcionMenuId implements Serializable {

    private Long id;
    private Long id_menu;

}
