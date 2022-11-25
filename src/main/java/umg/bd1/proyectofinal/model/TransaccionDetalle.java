package umg.bd1.proyectofinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TRANSACCION_DETALLE")
@AllArgsConstructor
@NoArgsConstructor
public class TransaccionDetalle {

    @Id
    @Column(name = "COD_LINEA")
    private Long linea;

    @Column(name = "MONTO_UNIDADES")
    private Double unidades;

    @Column(name = "MONTO_BONIFICACION")
    private Double bonificacion;

    @Column(name = "PRECIO_UNITARIO")
    private Double precioUnitario;

    @Column(name = "MONTO_TOTAL")
    private Double precioTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TRANSACCION")
    private Transaccion transaccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_MEDICAMENTO", referencedColumnName = "ID")
    private Medicamento medicamento;
}
