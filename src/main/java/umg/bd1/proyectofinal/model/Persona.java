package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PERSONA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "PERSONA_ID_SEQ"
    )
    @SequenceGenerator(
            name = "PERSONA_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE1")
    private String nombre1;
    @Column(name = "NOMBRE2")
    private String nombre2;
    @Column(name = "NOMBRE3")
    private String nombre3;
    @Column(name = "APELLIDO1")
    private String apellido1;
    @Column(name = "APELLIDO2")
    private String apellido2;
    @Column(name = "APELLIDO_CASADA")
    private String apellidoCasada;
    @Column(name = "DPI")
    private Long dpi;
    @Column(name = "NIT")
    private String nit;

    public String getNombreCompleto(){
        return String.format("%s %s %s %s", this.nombre1, this.nombre2, this.apellido1, this.apellido2);
    }

}
