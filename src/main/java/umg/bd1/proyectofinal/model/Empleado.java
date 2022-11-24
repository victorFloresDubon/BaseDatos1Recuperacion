package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "EMPLEADO")
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "FECHA_INGRESO")
    private Date fecha_ingreso;

    @Column(name = "SALARIO_BASE")
    private Double salario_base;

    @Column(name = "ESTADO_EMPLEADO")
    private Integer estado_empleado;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COD_PERSONA", referencedColumnName = "ID")
    private Persona cod_persona;

}
