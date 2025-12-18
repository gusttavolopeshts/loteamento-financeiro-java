package com.loteamento.finance.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class ContratoVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroContrato;
    private LocalDate dataVenda;
    private BigDecimal valorTotal;
    private BigDecimal valorEntrada;
    private Integer quantidadeParcelas;

    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
    private List<Parcela> parcelas;
}


// Adicione estes campos dentro da classe ContratoVenda
@ManyToOne
@JoinColumn(name = "cliente_id")
private Cliente cliente;

@OneToOne
@JoinColumn(name = "lote_id")
private Lote lote;