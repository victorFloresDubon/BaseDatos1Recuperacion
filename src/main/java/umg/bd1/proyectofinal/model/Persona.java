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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
