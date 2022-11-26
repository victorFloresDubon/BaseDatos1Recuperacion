package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TIPO_TRANSACCION_INVENTARIO")
@AllArgsConstructor
@NoArgsConstructor
public class TipoTransaccionInventario {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "TTI_SEQ"
    )
    @SequenceGenerator(
            name = "TTI_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "FACTOR")
    private Integer factor;
}
