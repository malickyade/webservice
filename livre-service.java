package com.biblio.rest.service;

import com.biblio.common.Livre;
import com.biblio.rest.repository.LivreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreService {

    private final LivreRepository livreRepository;

    public LivreService(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    public List<Livre> getAll() {
        return livreRepository.findAll();
    }

    public Optional<Livre> getById(Long id) {
        return livreRepository.findById(id);
    }

    public List<Livre> getDisponibles() {
        return livreRepository.findByEstDisponibleTrue();
    }
}
