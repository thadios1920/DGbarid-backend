package com.dgbarid.dgbarid.Utilisateur;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import static javax.persistence.GenerationType.AUTO;
@Entity
@Table(name = "Utilisateur",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "NomCompletU"
                        + ""),
                @UniqueConstraint(columnNames = "email")
        })
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

        public Utilisateur(){}

        public Utilisateur(int idUtilisateur,int codePostale,String password,String email,String nomCompletU,String adresse,String string,String pays,String region,int tel){
            this.tel = tel;
            this.adresse = adresse;
            this.codePostale = codePostale;
            this.idUtilisateur = idUtilisateur;
            this.email = email;
            this.pays = pays;
            this.password = password;
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
    @NotBlank
    @Size(max = 60)
    @Email
        private String email;
        private String password;

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
}

