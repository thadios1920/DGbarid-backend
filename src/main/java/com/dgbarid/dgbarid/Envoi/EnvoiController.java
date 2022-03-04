package com.dgbarid.dgbarid.Envoi;


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
public class EnvoiController {

    @Autowired
    private EnvoiService envoiService ;
    
    @GetMapping("/envois")
    public List<Envoi> listUsers(){
        return this.envoiService.getAll();
    }
    
    @PostMapping("/envois")
    public Envoi save(@RequestBody Envoi envoi) {
        System.out.println("Ajouter envois.");
        return envoiService.save(envoi);
    }

    @DeleteMapping("/{idEnvoi}")
    public ResponseEntity<Void> deleteEnvoi(@PathVariable int idEnvoi) {

        envoiService.delete(idEnvoi);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
