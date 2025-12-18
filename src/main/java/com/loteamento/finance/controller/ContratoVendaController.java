package com.loteamento.finance.controller;

import com.loteamento.finance.model.ContratoVenda;
import com.loteamento.finance.service.ContratoVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contratos")
public class ContratoVendaController {
    @Autowired
    private ContratoVendaService service;

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("contrato", new ContratoVenda());
        return "cadastro-contrato";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute ContratoVenda contrato) {
        service.salvarNovoContrato(contrato);
        return "redirect:/contratos/novo?sucesso";
    }
}