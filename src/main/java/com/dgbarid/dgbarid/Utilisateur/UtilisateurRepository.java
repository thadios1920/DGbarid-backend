package com.dgbarid.dgbarid.Utilisateur;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    
    Optional<Utilisateur> findBynomCompletU(String nomCompletU);
    Utilisateur findByemailAndPassword(String email, String password);

    List<Utilisateur> findAllByEmail(String email);
}
