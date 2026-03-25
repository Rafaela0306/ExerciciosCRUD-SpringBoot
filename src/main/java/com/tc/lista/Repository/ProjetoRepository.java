package com.tc.lista.Repository;

import com.tc.lista.Model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}