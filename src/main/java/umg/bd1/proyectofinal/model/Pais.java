package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "PAIS")
@AllArgsConstructor
@NoArgsConstructor
public class Pais {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NOM_PAIS")
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "COD_PAIS", referencedColumnName = "ID")
    private List<Departamento> departamentos;


}
