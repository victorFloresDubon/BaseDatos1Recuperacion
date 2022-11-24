package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import umg.bd1.proyectofinal.model.key.DepartamentoId;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "DEPARTAMENTO")
@AllArgsConstructor
@NoArgsConstructor
@IdClass(DepartamentoId.class)
public class Departamento {

    @Id
    @Column(name = "COD_PAIS")
    private String cod_pais;

    @Id
    @Column(name = "COD_DEPTO")
    private String cod_depto;

    @Column(name = "NOM_DEPTO")
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumns(value = {
            @JoinColumn(name = "COD_PAIS", referencedColumnName = "COD_PAIS"),
            @JoinColumn(name = "COD_DEPTO", referencedColumnName = "COD_DEPTO")
    })
    private List<Municipio> municipios;


}
