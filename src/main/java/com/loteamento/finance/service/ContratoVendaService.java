package com.loteamento.finance.service;

import com.loteamento.finance.model.*;
import com.loteamento.finance.repository.ContratoVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

@Service
public class ContratoVendaService {
    @Autowired
    private ContratoVendaRepository repository;

    @Transactional
    public ContratoVenda salvarNovoContrato(ContratoVenda contrato) {
        BigDecimal valorParcelavel = contrato.getValorTotal().subtract(contrato.getValorEntrada());
        BigDecimal valorDaParcela = valorParcelavel.divide(BigDecimal.valueOf(contrato.getQuantidadeParcelas()), 2, RoundingMode.HALF_UP);
        
        contrato.setParcelas(new ArrayList<>());
        for (int i = 1; i <= contrato.getQuantidadeParcelas(); i++) {
            Parcela p = new Parcela();
            p.setNumeroParcela(i);
            p.setValor(valorDaParcela);
            p.setDataVencimento(contrato.getDataVenda().plusMonths(i));
            p.setStatus("PENDENTE");
            p.setContrato(contrato);
            contrato.getParcelas().add(p);
        }
		
		// REGRA DE PARIDADE: Atualiza o status do lote para VENDIDO
		contrato.getLote().setSituacao("VENDIDO");
        return repository.save(contrato);
    }
}