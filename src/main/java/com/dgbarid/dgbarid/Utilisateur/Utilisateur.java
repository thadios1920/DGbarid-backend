package com.dgbarid.dgbarid.Utilisateur;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.dgbarid.dgbarid.Destinataire.Destinataire;


@Entity
@Table
public class Utilisateur {

        @Id
        @SequenceGenerator(
                name = "Utilisateur_sequence",
                sequenceName = "Utilisateur-sequence",
                allocationSize = 1
        )
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int idUtilisateur;
        @Column(name = "NomCompletU")
        
        private String nomCompletU;
        private String adresse;
        private int codePostale;
        private String pays;
        private String region;
        private boolean isAvtive;
        private int tel;
        @NotBlank
    @Size(max = 60)
    @Email
        private String email;
        private String password;

    //     @OneToMany 
    //    private List<Destinataire> destinataire;

        public Utilisateur(){}

        


    







    public Utilisateur(int idUtilisateur, String nomCompletU, String adresse, int codePostale, String pays,
                String region, boolean isAvtive, int tel, @NotBlank @Size(max = 60) @Email String email,
                String password, List<Destinataire> destinataire, String fileName, int code) {
            this.idUtilisateur = idUtilisateur;
            this.nomCompletU = nomCompletU;
            this.adresse = adresse;
            this.codePostale = codePostale;
            this.pays = pays;
            this.region = region;
            this.isAvtive = isAvtive;
            this.tel = tel;
            this.email = email;
            this.password = password;
            // this.destinataire = destinataire;
            this.fileName = fileName;
            this.code = code;
        }






    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private String fileName;
        private int code;
    

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomCompletU() {
        return nomCompletU;
    }

    public void setNomCompletU(String nomCompletU) {
        this.nomCompletU = nomCompletU;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String dresse) {
        this.adresse = dresse;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isAvtive() {
        return isAvtive;
    }

    public void setAvtive(boolean avtive) {
        isAvtive = avtive;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }












    // public List<Destinataire> getDestinataire() {
    //     return destinataire;
    // }












    // public void setDestinataire(List<Destinataire> destinataire) {
    //     this.destinataire = destinataire;
    // }




    
    
    
}

