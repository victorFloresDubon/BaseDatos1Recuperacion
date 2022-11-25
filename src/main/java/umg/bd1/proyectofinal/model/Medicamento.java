package umg.bd1.proyectofinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "MEDICAMENTO")
@AllArgsConstructor
@NoArgsConstructor
public class Medicamento {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "MEDICAMENTO_ID_SEQ"
    )
    @SequenceGenerator(
            name = "MEDICAMENTO_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "ACTIVO")
    private Integer activo;

    @ManyToOne
    @JoinColumn(name = "TIPO_MEDICAMENTO", referencedColumnName = "ID")
    private TipoMedicamento tipoMedicamento;

    @ManyToOne
    @JoinColumn(name = "PRINCIPIO_ACTIVO", referencedColumnName = "ID")
    private PrincipioActivo principioActivo;

    @ManyToOne
    @JoinColumn(name = "MARCA_MEDICAMENTO", referencedColumnName = "ID")
    private MarcaMedicamento marcaMedicamento;

    @ManyToMany(mappedBy = "medicamentos", cascade = {CascadeType.ALL})
    @JsonIgnore
    private List<Laboratorio> laboratorios = new ArrayList<>();
}
