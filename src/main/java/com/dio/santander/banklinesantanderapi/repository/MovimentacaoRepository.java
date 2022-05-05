package com.dio.santander.banklinesantanderapi.repository;

import com.dio.santander.banklinesantanderapi.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
}
