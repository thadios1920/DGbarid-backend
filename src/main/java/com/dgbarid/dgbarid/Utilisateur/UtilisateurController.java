package com.dgbarid.dgbarid.Utilisateur;


import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletContext;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin(origins = "http://localhost:8100")
@RequestMapping(path = "dgbarid")
public class UtilisateurController {

    private final UtilisateurService utilisateurService ;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping("/users")
    public List<Utilisateur> listUsers(){
        return this.utilisateurService.getAll();
        // return Arrays.asList(
        //     new Utilisateur(3, 2066, "password1", "email1@hh.com", "nomCompletU1", "adresse1", "codePostale1", "pays1", "region1", 1111)
        // );

    }
    @PostMapping("/users")
    public long save(@RequestBody Utilisateur User) {
        System.out.println("Save all Users...");
        return utilisateurService.save(User);
    }

    


    

//    @GetMapping(path="/Imgusers/{id}")
//    public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
//        Utilisateur User   =userService.findById(id).get();
//        return Files.readAllBytes(Paths.get(context.getRealPath("/Imagess/")+User.getFileName()));
//    }

}
