package com.tc.lista.Service;

import com.tc.lista.Model.Tarefa;
import com.tc.lista.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listar() {
        return repository.findAll();
    }

    public Tarefa buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}