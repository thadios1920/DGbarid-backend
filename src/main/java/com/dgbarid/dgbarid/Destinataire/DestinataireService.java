package com.dgbarid.dgbarid.Destinataire;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class DestinataireService {
    @Autowired
    private DestinataireRepository repository;

    @Autowired
    public List<Destinataire> getAll() {
        System.out.println("Get tous les destinataires.");
        return repository.findAll();
    }

    public Optional<Destinataire> findById(int idDest) {
        return repository.findById(idDest);
    }

    public Destinataire save(Destinataire dest) {
        System.out.println("Ajouter envoi .");
        return repository.save(dest);
    }

    public void delete(int idDest) {
        repository.deleteById(idDest);
    }
}
