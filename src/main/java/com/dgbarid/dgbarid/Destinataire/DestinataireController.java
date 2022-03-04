package com.dgbarid.dgbarid.Destinataire;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
@CrossOrigin(origins = "http://localhost:8100")
@RequestMapping(path = "dgbarid")
public class DestinataireController {

    @Autowired
    private DestinataireService destinataireService ;

   
    //Les requetes evoyées par l'App
    @GetMapping("/dests")
    public List<Destinataire> listUsers(){
        return this.destinataireService.getAll();
    }
    
    @PostMapping("/dests")
    public Destinataire save(@RequestBody Destinataire User) {
        System.out.println("Save all Users...");
        return destinataireService.save(User);
    }

    // @DeleteMapping("/{idUtilisateur}")
    // public ResponseEntity<Void> deleteDest(@PathVariable int idDest) {

    //     destinataireService.delete(idDest);
    //     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    // }

    
    
}
