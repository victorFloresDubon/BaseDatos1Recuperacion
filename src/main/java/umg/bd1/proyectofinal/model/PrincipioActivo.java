package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PRINCIPIO_ACTIVO")
@AllArgsConstructor
@NoArgsConstructor
public class PrincipioActivo {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "PRINCIPIO_ACTIVO_ID_SEQ"
    )
    @SequenceGenerator(
            name = "PRINCIPIO_ACTIVO_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPCION")
    private String descripcion;
}
