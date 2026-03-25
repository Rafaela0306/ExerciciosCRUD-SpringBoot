package com.tc.lista.Service;

import com.tc.lista.Model.Projeto;
import com.tc.lista.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository repository;

    public Projeto salvar(Projeto projeto) {
        return repository.save(projeto);
    }

    public List<Projeto> listar() {
        return repository.findAll();
    }

    public Projeto buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
