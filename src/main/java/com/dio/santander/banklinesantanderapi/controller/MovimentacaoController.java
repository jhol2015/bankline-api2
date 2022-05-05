package com.dio.santander.banklinesantanderapi.controller;

import com.dio.santander.banklinesantanderapi.dto.NovaMovimentacao;
import com.dio.santander.banklinesantanderapi.dto.NovoCorrentista;
import com.dio.santander.banklinesantanderapi.model.Movimentacao;
import com.dio.santander.banklinesantanderapi.repository.MovimentacaoRepository;
import com.dio.santander.banklinesantanderapi.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao){
        service.save(movimentacao );
    }
}
