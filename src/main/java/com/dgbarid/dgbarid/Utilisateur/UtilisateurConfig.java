package com.dgbarid.dgbarid.Utilisateur;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class UtilisateurConfig {

    @Bean
    CommandLineRunner CommandLineRunner(UtilisateurRepository repository){

        return args -> {
        //     Utilisateur u1 = new Utilisateur(1,"nom1", "adresse1", 12, "pays1", "reg1",65874125,"nom1@exemple.com","password1");
        //     Utilisateur u2 = new Utilisateur(2,"nom2", "adresse2", 13, "pays2", "reg2",65874125,"nom2@exemple.com","password2");
        //     Utilisateur u3 = new Utilisateur(3,"nom3", "adresse3", 14, "pays3", "reg3",65874125,"nom3@exemple.com","password3");
        //     Utilisateur u4 = new Utilisateur(4,"aymen ajroudi", "17 ibn sina", 2066, "Tunisie", "ibn sina",65874125,"aymen@exemple.com","password-aymen");
        //    repository.saveAll(List.of(u1,u2,u3,u4));
        };

    }
}

