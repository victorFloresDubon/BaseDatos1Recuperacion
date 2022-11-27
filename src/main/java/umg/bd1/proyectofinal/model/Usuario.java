package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "USUARIO")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "USUARIO_ID_SEQ"
    )
    @SequenceGenerator(
            name = "USUARIO_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOM_USUARIO")
    private String nombre;

    @Column(name = "PASSWORD")
    private String password;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "USUARIO_ROL",
            joinColumns = @JoinColumn(name = "ID_USUARIO"),
            inverseJoinColumns = @JoinColumn(name = "ID_ROL")
    )
    private List<Rol> roles;

    public void addRol(Rol rol){
        if (rol != null){
            if(roles == null){
                roles = new ArrayList<>();
            }
            roles.add(rol);
        }
    }
}
