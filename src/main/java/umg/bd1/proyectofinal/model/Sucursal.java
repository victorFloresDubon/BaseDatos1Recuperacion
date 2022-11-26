package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "SUCURSAL")
@AllArgsConstructor
@NoArgsConstructor
public class Sucursal {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SUCURSAL_ID_SEQ"
    )
    @SequenceGenerator(
            name = "SUCURSAL_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOM_SUCURSAL")
    private String nombre;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "ABREVIATURA")
    private String abreviatura;


}
