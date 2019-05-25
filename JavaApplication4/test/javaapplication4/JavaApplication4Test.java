/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1710523
 */
public class JavaApplication4Test {
    
    public JavaApplication4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     
    }
    
    @After
    public void tearDown() {
    }

    @Test ()
    public void testequal() {
        int[] solutionArray = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };
        JavaApplication4.shuffleArray(solutionArray);
        int sum = IntStream.of(solutionArray).sum();
        int a = 102;
    //assertEquals(sum, a);
    }

}
