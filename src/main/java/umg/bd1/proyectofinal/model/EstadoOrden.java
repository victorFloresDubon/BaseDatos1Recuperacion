package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ESTADO_ORDEN")
@AllArgsConstructor
@NoArgsConstructor
public class EstadoOrden{

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ESTADO_ORDEN_ID_SEQ"
    )
    @SequenceGenerator(
            name = "ESTADO_ORDEN_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPCION")
    private String descripcion;
}
