package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CLIENTE")
@AllArgsConstructor
@NoArgsConstructor
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOM_SUCURSAL")
    private String nombre;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "ABREVIATURA")
    private String abreviatura;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    /*@JoinColumns(value = {
            @JoinColumn(name = "COD_PAIS", referencedColumnName = "COD_PAIS"),
            @JoinColumn(name = "COD_DEPTO", referencedColumnName = "COD_DEPTO"),
            @JoinColumn(name = "COD_MUNICIPIO", referencedColumnName = "COD_MUNICIPIO"),
            @JoinColumn(name = "COD_ZONA", referencedColumnName = "COD_ZONA")
    })*/
    private Zona zona;
}
