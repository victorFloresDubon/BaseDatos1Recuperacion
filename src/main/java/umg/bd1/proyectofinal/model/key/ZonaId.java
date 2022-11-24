package umg.bd1.proyectofinal.model.key;

import lombok.*;

@Data
@NoArgsConstructor
public class ZonaId extends MunicipioId{

    private String cod_zona;

    public ZonaId(String cod_pais, String cod_depto, String cod_municipio, String cod_zona) {
        super(cod_pais, cod_depto, cod_municipio);
        this.cod_zona = cod_zona;
    }

}
