package com.tc.lista.Repository;

import com.tc.lista.Model.Fornecedores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedoresRepository extends JpaRepository<Fornecedores, Long> {
}