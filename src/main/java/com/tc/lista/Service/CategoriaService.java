package com.tc.lista.Service;

import com.tc.lista.Model.Categoria;
import com.tc.lista.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria salvar(Categoria categoria) {
        return repository.save(categoria);
    }

    public List<Categoria> listar() {
        return repository.findAll();
    }

    public Categoria buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}