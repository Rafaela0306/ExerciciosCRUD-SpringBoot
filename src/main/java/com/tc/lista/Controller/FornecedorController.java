package com.tc.lista.Controller;

import com.tc.lista.Model.Fornecedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import import com.tc.lista.Service.FornecedorService;
import com.tc.lista.Model.Cliente;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService service;

    @PostMapping
    public Fornecedores criar(@RequestBody Fornecedores fornecedor) {
        return service.salvar(fornecedor);
    }

    @GetMapping
    public List<Fornecedores> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Fornecedores buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}