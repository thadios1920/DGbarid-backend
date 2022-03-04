package com.dgbarid.dgbarid.Destinataire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DestinataireRepository extends JpaRepository<Destinataire, Integer> {
    
}
