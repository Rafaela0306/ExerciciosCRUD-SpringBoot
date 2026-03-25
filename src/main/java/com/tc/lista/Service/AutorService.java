package com.tc.lista.Service;

import com.tc.lista.Model.Autor;
import com.tc.lista.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public Autor salvar(Autor autor) {
        return repository.save(autor);
    }

    public List<Autor> listar() {
        return repository.findAll();
    }

    public Autor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}