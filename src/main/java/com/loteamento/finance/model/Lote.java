package com.loteamento.finance.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Lote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String quadra;
    private String numeroLote;
    private Double metragem;
    private String status; // DISPONÍVEL, VENDIDO, RESERVADO
}