package com.dgbarid.dgbarid.Envoi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class EnvoiService {

    @Autowired
    private EnvoiRepository repository;

    @Autowired
    public List<Envoi> getAll() {
        System.out.println("Get Envoi.");
        return repository.findAll();
    }

    public Optional<Envoi> findById(int id) {
        return repository.findById(id);
    }

    public Envoi save(Envoi envoi) {
        System.out.println("Ajouter envoi .");
        return repository.save(envoi);
    }

    public void delete(int idEnvoi) {
        repository.deleteById(idEnvoi);
    }
}
