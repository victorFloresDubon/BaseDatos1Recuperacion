package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ESTADO_TRACKING")
@AllArgsConstructor
@NoArgsConstructor
public class EstadoTracking {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ESTADO_TRACKING_ID_SEQ"
    )
    @SequenceGenerator(
            name = "ESTADO_TRACKING_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPCION")
    private String descripcion;
}
