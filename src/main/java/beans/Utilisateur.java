/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Khalid
 */
public class Utilisateur {
    private Long id;
    @NotNull(message = "Veuillez saisir un nom")
    @Size(min = 3, max = 15,message = "La longueur du nom doit être comprise entre 3 et 15")
    private String nom;
    @NotNull(message = "Veuillez saisir un prenom")
    @Size(min = 3, max = 15,message = "La longueur du prenom doit être comprise entre 3 et 15")
    private String prenom;
    @NotNull(message = "Veuillez saisir un email")
    private String email;
    @NotNull(message = "Veuillez saisir un age")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    } 

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
