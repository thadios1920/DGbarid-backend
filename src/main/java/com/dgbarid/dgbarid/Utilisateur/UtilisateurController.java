package com.dgbarid.dgbarid.Utilisateur;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
@CrossOrigin(origins = "http://localhost:8100")
@RequestMapping(path = "dgbarid")
public class UtilisateurController {

    private final UtilisateurService utilisateurService ;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }
    //Les requetes evoyées par l'App
    @GetMapping("/users")
    public List<Utilisateur> listUsers(){
        return this.utilisateurService.getAll();
    }
    
    @PostMapping("/users")
    public Utilisateur save(@RequestBody Utilisateur User) {
        System.out.println("Save all Users...");
        return utilisateurService.save(User);
    }

    @DeleteMapping("/{idUtilisateur}")
    public ResponseEntity<Void> deleteUser(@PathVariable int idUtilisateur) {

        utilisateurService.delete(idUtilisateur);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping (method =RequestMethod.PUT,value = "{idUtilisateur}")
    public void updateUser(@RequestBody Utilisateur user,@PathVariable int idUtilisateur) {
        utilisateurService.update(idUtilisateur, user);
    }
	


    


}
