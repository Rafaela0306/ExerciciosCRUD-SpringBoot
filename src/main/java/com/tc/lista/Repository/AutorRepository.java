package com.tc.lista.Repository;

import com.tc.lista.Model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<Autor, Long> {
}