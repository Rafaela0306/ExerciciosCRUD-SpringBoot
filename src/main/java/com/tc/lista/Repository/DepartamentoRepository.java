package com.tc.lista.Repository;

import com.tc.lista.Model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tc.lista.Model.Cliente;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}