package com.dgbarid.dgbarid.Utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UtilisateurService {
    private final UtilisateurRepository repository;
    @Autowired
    public UtilisateurService(UtilisateurRepository repository) {
    this.repository = repository;
} 
    @Autowired
    

    public List<Utilisateur> getAll() {
        System.out.println("Get all Users 11111...");
        return repository.findAll();
    }




    public List<Utilisateur> getAllByEmail(String email) {
        System.out.println("Get all Users 11111...");
        return repository.findAllByEmail(email);
    }


    public Optional<Utilisateur> findById(long id) {
        return repository.findById((int) id);
    }

    public long save(Utilisateur User) {
        System.out.println("save  all Users 11111...");
        User.setAvtive(true);
        return repository.save(User)
                .getIdUtilisateur();
    }
    public void update(long id, Utilisateur User) {
        Optional<Utilisateur> userr = repository.findById((int) id);
        if (userr.isPresent()) {
            Utilisateur user = userr.get();

            user.setEmail(User.getEmail());
            user.setPassword(User.getPassword());
            user.setNomCompletU(User.getNomCompletU());
            user.setAdresse(User.getAdresse());
            user.setPays(User.getPays());
            user.setAvtive(User.isAvtive());
            repository.save(user);
        }
    }


    public Optional<Utilisateur> login(String nomCompletU) {
        return repository.findBynomCompletU(nomCompletU);
    }

    public void delete(long id) {
        Optional<Utilisateur> user = repository.findById((int) id);
        user.ifPresent(repository::delete);
    }
}
