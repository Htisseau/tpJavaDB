/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjavadb;

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hugo
 */
public class JoueurTest {
    
    public JoueurTest() {
    }

    @Test
    public void testGetById() throws SQLException {
        System.out.println("getById");
        Joueur instance = new Joueur();
        Joueur result = instance.getById(1);
        assertEquals("Hugo", result.getLogin());
    }

   /* @Test
    public void testGetByLoginPwd() {
        System.out.println("getByLoginPwd");
        String login = "";
        String pwd = "";
        Joueur instance = null;
        int expResult = 0;
        int result = instance.getByLoginPwd(login, pwd);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Joueur instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Joueur instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    */
}
