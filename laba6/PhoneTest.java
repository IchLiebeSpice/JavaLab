/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.phone6;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;
/**
 *
 * @author 1710523
 */
public class PhoneTest {
    
    public PhoneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class People.
     */
    @Test
    public void getPriceTest() {
        Phone phone = mock(Phone.class);
        when(phone.getPrice()).thenReturn(2500);
        assertEquals(2500, phone.getPrice());
    }
    @Test
    public void getYearTest() {
        Phone phone = mock(Phone.class);
        when(phone.getYear()).thenReturn(2010);
        assertEquals(2017, phone.getYear());
    }
    @Test
    public void getNumberTest() {
        Phone phone = mock(Phone.class);
        when(phone.getNumber()).thenReturn(400);
        assertEquals(400, phone.getNumber());
    }
    
    
    @Test
    public void setYearTest(){
        Phone phone = mock(Phone.class);
        phone.setYear(2010);
        phone.setYear(2012);
        phone.setYear(2015);
        phone.setYear(2013);
        phone.setYear(2001);

        verify(phone, times(1)).setYear(2015);
        verify(phone, times(3)).setYear(2013);
        verify(phone, times(1)).setYear(2010);

        InOrder inOrder = inOrder(phone);
        inOrder.verify(phone).setYear(2015);
        inOrder.verify(phone, times(3)).setYear(2013);
        inOrder.verify(phone).setYear(2010);
    }
}
