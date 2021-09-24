/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SESI_SENAI
 */
public class CaesTest {
    Caes dog;
    
    public CaesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       dog = new Caes("Penny", 6);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of falar method, of class Caes.
     */
    @Test
    public void testFalar() {
        System.out.println("falar");
        String mensagem = "Auau";
        String expResult = "Meu nome é Penny, " + mensagem;
        String result = dog.falar(mensagem);
        assertEquals(expResult, result);
    }

    /**
     * Test of andar method, of class Caes.
     */
    @Test
    public void testAndar() {
        System.out.println("andar");
        int num_passos = 2000;
        boolean expResult = true;
        boolean result = dog.andar(num_passos);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testAndarani() {
        System.out.println("animado");
        String esperado = "animado"; 
        dog.andar(900);
        assertEquals(esperado, dog.humor);
    }
    
        @Test
    public void testAndarcan() {
        System.out.println("cansado");
        String esperado = "cansado"; 
        dog.andar(2000);
        assertEquals(esperado, dog.humor);
    }
    
    /**
     * Test of comer method, of class Caes.
     */
    @Test
    public void testComer() {
        System.out.println("comer");
        dog.comer();
    }

    @Test
    public void testComerpeso() {
        System.out.println("comer peso");
        float peso=  dog.peso;
        dog.comer();
        assertEquals(dog.peso, peso+0.01F, 0);
    }
    
    /**
     * Test of dormir method, of class Caes.
     */
    @Test
    public void testDormir() {
        System.out.println("dormir");
        boolean expResult = false;
        boolean result = dog.dormir();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDormirani() {
        System.out.println("dormir animado");
        dog.humor = "animado";
        boolean expResult = false;
        boolean result = dog.dormir();
        assertEquals(expResult, result);
    }
}
