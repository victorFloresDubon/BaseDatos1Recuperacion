package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TIPO_PAGO")
@AllArgsConstructor
@NoArgsConstructor
public class TipoPago {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "TIPO_PAGO_ID_SEQ"
    )
    @SequenceGenerator(
            name = "TIPO_PAGO_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPCION")
    private String descripcion;
}
