package com.biblio.rest.repository;

import com.biblio.common.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Long> {
    List<Livre> findByEstDisponibleTrue();
}
