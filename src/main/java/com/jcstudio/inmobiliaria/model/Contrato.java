package com.jcstudio.inmobiliaria.model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "CONTRATOS")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONT_ID")
    private Long contId;

    // Relaciones (vinculan tus tablas en la BD)
    @ManyToOne
    @JoinColumn(name = "PROP_ID")
    private Propiedad propiedad;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID")
    private Cliente cliente;

    //@ManyToOne
    //@JoinColumn(name = "AGENTE_ID")
    //private Usuario agente; // Usando tu clase Usuario (que crearás luego)

    // Campos del contrato
    @Column(name = "FECHA_INICIO")
    private LocalDate fechaInicio;

    @Column(name = "FECHA_FIN")
    private LocalDate fechaFin;

    @Column(name = "MONTO_TOTAL")
    private Double montoTotal;

    @Column(name = "ESTADO")
    private String estado;

    // Auditoría (Relación con Sesiones)
    @ManyToOne
    @JoinColumn(name = "SES_ID_CREACION")
    private Sesion sesionCreacion;

    @ManyToOne
    @JoinColumn(name = "SES_ID_MODIFICACION")
    private Sesion sesionModificacion;

    @Column(name = "CREATED_AT", insertable = false, updatable = false)
    private LocalDateTime createdAt;
}
