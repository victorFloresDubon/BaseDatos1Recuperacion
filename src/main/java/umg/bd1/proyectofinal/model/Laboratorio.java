package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "LABORATORIO")
@AllArgsConstructor
@NoArgsConstructor
public class Laboratorio {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "LABORATORIO_ID_SEQ"
    )
    @SequenceGenerator(
            name = "LABORATORIO_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE_LABORATORIO")
    private String nombre;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TIPO_LABORATORIO", referencedColumnName = "ID")
    private TipoLaboratorio tipo;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "LABORATORIO_MEDICAMENTO",
            joinColumns = @JoinColumn(name = "ID_LABORATORIO"),
            inverseJoinColumns = @JoinColumn(name = "ID_MEDICAMENTO")
    )
    private List<Medicamento> medicamentos = new ArrayList<>();
}
