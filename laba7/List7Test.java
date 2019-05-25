/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labanom7;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spice
 */
public class List7Test {
    
    public List7Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class List7.
     */
    @Test
    public void testMain() {
        
        List7 list = new List7();
        list.add("0");
        list.add("1");
        System.out.println(list.get());
        System.out.println(list.get(0));
        list.add("2");
        list.add("3");
        System.out.println(list);
 
        System.out.println(list.remove(2));
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
 
    }
}
    

