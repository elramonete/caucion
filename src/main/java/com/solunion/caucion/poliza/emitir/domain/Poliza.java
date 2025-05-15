package com.solunion.caucion.poliza.emitir.domain;

import com.solunion.caucion.shared.domain.Cliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "polizas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Poliza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "prima")
    private BigDecimal prima;

    @Column(name = "fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;


}
