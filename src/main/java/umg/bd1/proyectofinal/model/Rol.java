package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "ROL")
@AllArgsConstructor
@NoArgsConstructor
public class Rol {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ROL_ID_SEQ"
    )
    @SequenceGenerator(
            name = "ROL_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE_ROL")
    private String descripcion;

    @ManyToMany
    @JoinTable(
            name = "ROL_OPCION",
            joinColumns = {
                    @JoinColumn(name = "ID_ROL")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ID_OPCION")
            }
    )
    private List<OpcionMenu> opciones;
}
