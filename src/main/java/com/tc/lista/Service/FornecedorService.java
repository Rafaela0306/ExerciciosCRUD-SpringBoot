package com.tc.lista.Service;

import com.tc.lista.Model.Fornecedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tc.lista.Repository.FornecedoresRepository;
import com.tc.lista.Model.Cliente;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedoresRepository repository;

    public Fornecedores salvar(Fornecedores fornecedor) {
        return repository.save(fornecedor);
    }

    public List<Fornecedores> listar() {
        return repository.findAll();
    }

    public Fornecedores buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}