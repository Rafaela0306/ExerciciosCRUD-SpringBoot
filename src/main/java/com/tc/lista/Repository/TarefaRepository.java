package com.tc.lista.Repository;


import com.tc.lista.Model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}