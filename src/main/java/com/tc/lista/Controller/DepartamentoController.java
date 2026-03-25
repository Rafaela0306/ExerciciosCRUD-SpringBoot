package com.tc.lista.Controller;

import com.tc.lista.Model.Departamento;
import com.tc.lista.Service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService service;

    @PostMapping
    public Departamento criar(@RequestBody Departamento departamento) {
        return service.salvar(departamento);
    }

    @GetMapping
    public List<Departamento> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Departamento buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}