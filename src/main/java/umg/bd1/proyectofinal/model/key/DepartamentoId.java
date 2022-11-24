package umg.bd1.proyectofinal.model.key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoId implements Serializable {

    private String cod_pais;
    private String cod_depto;

}
