package com.dgbarid.dgbarid.Destinataire;


import javax.persistence.*;

import com.dgbarid.dgbarid.Utilisateur.Utilisateur;

@Entity
@Table
public class Destinataire {

    @Id
    private int idDest;
    private String nomCompletD;
    private String email;
    private int tel;
    private String pays;
    public String adresse;
    public int postale;

    
    // private Utilisateur utilisateur;

    
    

    

    public Destinataire(int idDest, String nomCompletD, String email, int tel, String pays, String adresse, int postale,
            Utilisateur user) {
        this.idDest = idDest;
        this.nomCompletD = nomCompletD;
        this.email = email;
        this.tel = tel;
        this.pays = pays;
        this.adresse = adresse;
        this.postale = postale;
        // this.utilisateur = user;
    }

    public Destinataire() {
    }

    public int getIdDest() {
        return idDest;
    }

    public void setIdDest(int idDest) {
        this.idDest = idDest;
    }

    public String getNomCompletD() {
        return nomCompletD;
    }

    public void setNomCompletD(String nomCompletD) {
        this.nomCompletD = nomCompletD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPostale() {
        return postale;
    }

    public void setPostale(int postale) {
        this.postale = postale;
    }

    // public Utilisateur getUser() {
    //     return utilisateur;
    // }

    // public void setUser(Utilisateur user) {
    //     this.utilisateur = user;
    // }

   
    
}


    
    



    

