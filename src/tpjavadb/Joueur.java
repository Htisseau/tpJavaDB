/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjavadb;

import java.util.Objects;




/**
 *
 * @author Hugo
 */
public class Joueur {
    
    private int id;
    private String login;
    private String pwd;
    
    
    public int getId() {
        return id;
    }
    
    public String getLogin() {
        return login;
    }
    
    public String getPwd() {
        return pwd;
    }
    
    public void setLogin(String log) {
        login = log;
    }
    
    public void setPwd(String pass) {
        pwd = pass;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Joueur other = (Joueur) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.pwd, other.pwd)) {
            return false;
        }
        return true;
    }
    
    
}
