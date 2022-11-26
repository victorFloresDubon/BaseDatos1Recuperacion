package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TIPO_LABORATORIO")
@AllArgsConstructor
@NoArgsConstructor
public class TipoLaboratorio {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "TIPO_LABORATORIO_ID_SEQ"
    )
    @SequenceGenerator(
            name = "TIPO_LABORATORIO_ID_SEQ",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "DESCRIPCION")
    private String descripcion;


}
