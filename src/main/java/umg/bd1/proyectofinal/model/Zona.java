package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import umg.bd1.proyectofinal.model.key.ZonaId;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ZONA")
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ZonaId.class)
public class Zona {

    @Id
    @Column(name = "COD_PAIS")
    private String cod_pais;

    @Id
    @Column(name = "COD_DEPTO")
    private String cod_depto;

    @Id
    @Column(name = "COD_MUNICIPIO")
    private String cod_municipio;

    @Id
    @Column(name = "COD_ZONA")
    private String cod_zona;

    @Column(name = "NOM_ZONA")
    private String nombre;

}
