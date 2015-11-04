/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpjavadb;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Hugo
 */
public class JoueurTest {
    
    public JoueurTest() {
    }

    @Before
    public void testConstructor() {
        
        Joueur instance = new Joueur("Jeffrey", "mdp");
        assertEquals("Jeffrey", instance.getLogin());
        assertEquals(1, instance.getId());
        assertEquals("mdp", instance.getPwd());
        
    }
    
    
}
