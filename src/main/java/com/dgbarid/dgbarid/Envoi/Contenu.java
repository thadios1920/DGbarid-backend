package com.dgbarid.dgbarid.Envoi;

import javax.persistence.*;

@Entity
@Table
public class Contenu {


    @Id
    private int idContenu;
    private int codeHS;
    private String natureContenu;
    private String typeCintenu;
    private String detail;
    private int nembre;
    private double poids;
    
    @ManyToOne
    private Envoi envoi;

    

    

    public Contenu(int idContenu, int codeHS, String natureContenu, String typeCintenu, String detail, int nembre,
            double poids, Envoi envoi) {
        this.idContenu = idContenu;
        this.codeHS = codeHS;
        this.natureContenu = natureContenu;
        this.typeCintenu = typeCintenu;
        this.detail = detail;
        this.nembre = nembre;
        this.poids = poids;
        this.envoi = envoi;
    }

    public Contenu() {
    }

    public int getCodeHS() {
        return codeHS;
    }

    public void setCodeHS(int codeHS) {
        this.codeHS = codeHS;
    }

    public String getNatureContenu() {
        return natureContenu;
    }

    public void setNatureContenu(String natureContenu) {
        this.natureContenu = natureContenu;
    }

    public String getTypeCintenu() {
        return typeCintenu;
    }

    public void setTypeCintenu(String typeCintenu) {
        this.typeCintenu = typeCintenu;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getNembre() {
        return nembre;
    }

    public void setNembre(int nembre) {
        this.nembre = nembre;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public int getIdContenu() {
        return idContenu;
    }

    public void setIdContenu(int idContenu) {
        this.idContenu = idContenu;
    }

    public Envoi getEnvoi() {
        return envoi;
    }

    public void setEnvoi(Envoi envoi) {
        this.envoi = envoi;
    }

    
    
    
}
