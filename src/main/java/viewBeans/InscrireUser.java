/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewBeans;

import beans.Utilisateur;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import services.UserService;

/**
 *
 * @author Khalid
 */
@ManagedBean
@ViewScoped
public class InscrireUser implements Serializable{
    private Utilisateur user;
    private UserService userservice;
    
    public InscrireUser(){
        user = new Utilisateur();
        userservice = new UserService();
    }
    
    public void inscrire(){
        Integer newId = userservice.ajouterUtilisateur(user);
        FacesMessage msg =  new FacesMessage(FacesMessage.SEVERITY_INFO, "Inscription effectuée avec succées", "détail de l'inscription");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public Utilisateur getUser() {
        return user;
    }
}
