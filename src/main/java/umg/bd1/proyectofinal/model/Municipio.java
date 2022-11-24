package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import umg.bd1.proyectofinal.model.key.MunicipioId;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "MUNICIPIO")
@AllArgsConstructor
@NoArgsConstructor
@IdClass(MunicipioId.class)
public class Municipio {

    @Id
    @Column(name = "COD_PAIS")
    private String cod_pais;

    @Id
    @Column(name = "COD_DEPTO")
    private String cod_depto;

    @Id
    @Column(name = "COD_MUNICIPIO")
    private String cod_municipio;

    @Column(name = "NOM_MUNICIPIO")
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL)
    /*@JoinColumns(value = {
            @JoinColumn(name = "COD_PAIS", referencedColumnName = "COD_PAIS"),
            @JoinColumn(name = "COD_DEPTO", referencedColumnName = "COD_DEPTO"),
            @JoinColumn(name = "COD_MUNICIPIO", referencedColumnName = "COD_MUNICIPIO")
    })
     */
    private List<Zona> zonas;
}
