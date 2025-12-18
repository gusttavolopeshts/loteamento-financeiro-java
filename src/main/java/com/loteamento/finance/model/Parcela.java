package com.loteamento.finance.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Parcela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numeroParcela;
    private BigDecimal valor;
    private LocalDate dataVencimento;
    private String status;

    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private ContratoVenda contrato;
}