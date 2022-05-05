package com.dio.santander.banklinesantanderapi.repository;

import com.dio.santander.banklinesantanderapi.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
}
