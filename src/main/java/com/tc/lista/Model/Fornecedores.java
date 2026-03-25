package com.tc.lista.Model;

import jakarta.persistence.*;

@Entity(name = "Fornecedores")
@Table(name = "tb_fornecedores")
public class Fornecedores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(name = "cnpj_fornecedores")
    private String cnpj;

    private String contato;

    public Long getId() {
        return id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}