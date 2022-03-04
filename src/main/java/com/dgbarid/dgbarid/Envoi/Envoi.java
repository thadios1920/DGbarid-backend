package com.dgbarid.dgbarid.Envoi;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.*;



@Entity
@Table
public class Envoi {

    @Id
    private int idEnvoi;
    private int idClient;
    private int idDestinataire;
    private int montantEnvoi;
    private int numAssurance;
    private String modePayement;
    private double poids;
    
    @OneToMany (mappedBy = "envoi")
    private List<Contenu> contenu;


   


    public Envoi(int idEnvoi, int idClient, int idDestinataire, int montantEnvoi, int numAssurance, String modePayement,
            double poids, List<Contenu> contenu) {
        this.idEnvoi = idEnvoi;
        this.idClient = idClient;
        this.idDestinataire = idDestinataire;
        this.montantEnvoi = montantEnvoi;
        this.numAssurance = numAssurance;
        this.modePayement = modePayement;
        this.poids = poids;
        this.contenu = contenu;
    }


    public Envoi() {
    }


    public int getIdEnvoi() {
        return idEnvoi;
    }


    public void setIdEnvoi(int idEnvoi) {
        this.idEnvoi = idEnvoi;
    }


    public int getMontantEnvoi() {
        return montantEnvoi;
    }


    public void setMontantEnvoi(int montantEnvoi) {
        this.montantEnvoi = montantEnvoi;
    }


    public int getNumAssurance() {
        return numAssurance;
    }


    public void setNumAssurance(int numAssurance) {
        this.numAssurance = numAssurance;
    }


    public String getModePayement() {
        return modePayement;
    }


    public void setModePayement(String modePayement) {
        this.modePayement = modePayement;
    }


    public double getPoids() {
        return poids;
    }


    public void setPoids(double poids) {
        this.poids = poids;
    }


    public List<Contenu> getContenu() {
        return contenu;
    }


    public void setContenu(List<Contenu> contenu) {
        this.contenu = contenu;
    }


    public int getIdClient() {
        return idClient;
    }


    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }


    public int getIdDestinataire() {
        return idDestinataire;
    }


    public void setIdDestinataire(int idDestinataire) {
        this.idDestinataire = idDestinataire;
    }


    


    

    

    


    
}