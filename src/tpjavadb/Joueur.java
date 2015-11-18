/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjavadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Clock;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;




/**
 *
 * @author Hugo
 */
public class Joueur {
    
    private int id;
    private String login;
    private String pwd;
    private Connection connexion;

    Joueur(int i, String hooman, String mdp) {
        this.id = i;
        this.login = hooman;
        this.pwd = mdp;
    }

    Joueur() {
        
    }
    
    /*
      recupere l'id du joueur
    */
    public Joueur getById(int id) throws SQLException {
        connexion = Database.getConnection();
        String sql = "SELECT * FROM joueur WHERE id='"+id+"';";
        
        
        Statement order = connexion.createStatement();
        ResultSet rs = order.executeQuery(sql);
        
        
        Joueur joueur = new Joueur();
        rs.next();
        joueur.setId(rs.getInt(1));
        joueur.setLogin(rs.getString(2));
        joueur.setPwd(rs.getString(3));
        
        return joueur;
    }
        
    /*
      recupere le login du joueur
    */
    public int getByLoginPwd(String login, String pwd) {
        return id;
    }
    
    
    /*
      return le login du joueur
    */
    public String getLogin() {
        return login;
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

    private void setId(int id) {
        this.id = id;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    private void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    
}
