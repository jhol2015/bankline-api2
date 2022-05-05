package com.dio.santander.banklinesantanderapi.controller;

import com.dio.santander.banklinesantanderapi.dto.NovoCorrentista;
import com.dio.santander.banklinesantanderapi.model.Correntista;
import com.dio.santander.banklinesantanderapi.repository.CorrentistaRepository;
import com.dio.santander.banklinesantanderapi.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;

    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista){
        service.save(correntista);
    }
}
