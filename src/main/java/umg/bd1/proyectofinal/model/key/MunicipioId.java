package umg.bd1.proyectofinal.model.key;

import lombok.*;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor
public class MunicipioId extends DepartamentoId implements Serializable{

    private String cod_municipio;

    @Builder
    public MunicipioId(String cod_pais, String cod_depto, String cod_municipio) {
        super(cod_pais, cod_depto);
        this.cod_municipio = cod_municipio;
    }
}
