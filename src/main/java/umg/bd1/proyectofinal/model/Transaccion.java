package umg.bd1.proyectofinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "TRANSACCION")
@AllArgsConstructor
@NoArgsConstructor
public class Transaccion {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "TRANSACCION_ID_SEQ"
    )
    @SequenceGenerator(
            name = "TRANSACCION_ID_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "FECHA")
    private Date fecha;

    @Column(name = "MONTO_TRANSACCION")
    private Double montoTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_SUCURSAL", referencedColumnName = "ID")
    private Sucursal sucursal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_EMPLEADO", referencedColumnName = "ID")
    private Empleado empleado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_TRANSACCION", referencedColumnName = "ID")
    private TipoTransaccionInventario tipoTransaccionInventario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ESTADO_TRANSACCION", referencedColumnName = "ID")
    private EstadoOrden estadoOrden;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_CLIENTE", referencedColumnName = "ID")
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "transaccion")
    private List<TransaccionDetalle> detalles = new ArrayList<>();

    /**
     * Método para agregar un nuevo item al detalle de la transacción
     * @param detalle
     */
    public void agregarItem(TransaccionDetalle detalle){

        if(detalle != null){
            detalles.add(detalle);
        }

    }
}
