package com.ciclo.ciclo.Repositories;

import com.ciclo.ciclo.Models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioEmpresa extends JpaRepository<Empresa, Long> {
}
