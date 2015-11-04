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
    
    private Joueur instance;

    @Before
    public void testConstructor() {
        
        instance = new Joueur("Hooman", "mdp");
        assertEquals("Hooman", instance.getLogin());
        assertEquals(1, instance.getId());
        assertEquals("mdp", instance.getPwd());
        
    }
    
    
}
