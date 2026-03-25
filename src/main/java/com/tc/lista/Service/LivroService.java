package com.tc.lista.Service;

import com.tc.lista.Model.Livro;
import com.tc.lista.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro salvar(Livro livro) {
        return repository.save(livro);
    }

    public List<Livro> listar() {
        return repository.findAll();
    }

    public Livro buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}