/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.logic;

import edu.escuelaing.arem.logic.LinkedList;
import edu.escuelaing.arem.logic.StatisCalcs;
import java.io.IOException;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author 2099190
 */
public class CalcTest extends TestCase {
    
    public CalcTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }



    /**
     * Test of media method, of class App.
     * Test #1
     * Tests the result of the mean in column 1 from Table 1
     */
    @Test
    public void testColumn1Mean() throws IOException{
        double expectedMean = 550.60;
        double actualMean = 0.0;
        StatisCalcs c1m_test = new StatisCalcs();
        LinkedList col_1 = c1m_test.col_1;
        LinkedList col_2 = c1m_test.col_2;
        c1m_test.readFile();
        
        actualMean = c1m_test.media(col_1);
        assertEquals(expectedMean, actualMean);        
        //Reinicia Linked List y la deja vacia para siguientes tests
        col_1.clear();
        col_2.clear();
        
    }

    /**
     * Test of desEstandar method, of class App.
     * Test #2
     * Tests the result of the standard deviation in column 1 from Table 1
     */
    @Test
    public void testColumn1StdDeviation() throws IOException {
        double expectedStdDeviation = 572.03;
        double actualStdDeviation = 0.0;
        StatisCalcs c1s_test = new StatisCalcs();        
        LinkedList col_1 = c1s_test.col_1;
        LinkedList col_2 = c1s_test.col_2;
        c1s_test.readFile();        
        
        actualStdDeviation = c1s_test.desEstandar(col_1);
        assertEquals(expectedStdDeviation, actualStdDeviation);
        //Reinicia Linked List y la deja vacia para siguientes tests
        col_1.clear();
        col_2.clear();
    }
    
    /**
     * Test of media method, of class App.
     * Test #3
     * Tests the result of the mean in column 2 from Table 1
     */
    @Test
    public void testColumn2Mean() throws IOException{
        double expectedMean = 60.32;
        double actualMean = 0.0;
        StatisCalcs c2m_test = new StatisCalcs(); 
        LinkedList col_1 = c2m_test.col_1;
        LinkedList col_2 = c2m_test.col_2;
        c2m_test.readFile();
        
        actualMean = c2m_test.media(col_2);
        assertEquals(expectedMean, actualMean);        
        //Reinicia Linked List y la deja vacia para siguientes tests
        col_1.clear();
        col_2.clear();      
    }

    /**
     * Test of desEstandar method, of class App.
     * Test #2
     * Tests the result of the standard deviation in column 1 from Table 1
     */
    @Test
    public void testColumn2StdDeviation() throws IOException {
        double expectedStdDeviation = 62.26;
        double actualStdDeviation = 0.0;
        StatisCalcs c2s_test = new StatisCalcs(); 
        LinkedList col_1 = c2s_test.col_1;
        LinkedList col_2 = c2s_test.col_2;
        c2s_test.readFile();        
        
        actualStdDeviation = c2s_test.desEstandar(col_2);
        assertEquals(expectedStdDeviation, actualStdDeviation);
        //Reinicia Linked List y la deja vacia para siguientes tests
        col_1.clear();
        col_2.clear();
    }
    
    /**
     * Test of Size method, of class LinkedList.
     * Test #5
     * Tests the length of both columns from Table 1
     */
    @Test
    public void testSize() throws IOException{
        int expectedSizeCol1 = 10;
        int expectedSizeCol2 = 10;
        int actualSizeCol1, actualSizeCol2 = 0;
        StatisCalcs c1s_test = new StatisCalcs();        
        LinkedList col_1 = c1s_test.col_1;
        LinkedList col_2 = c1s_test.col_2;
        c1s_test.readFile();
        
        actualSizeCol1 = c1s_test.col_1.getSize();
        actualSizeCol2 = c1s_test.col_2.getSize();
        
        assertEquals(expectedSizeCol1, actualSizeCol1);
        assertEquals(expectedSizeCol2, actualSizeCol2);        
        //Reinicia Linked List y la deja vacia para siguientes tests
        col_1.clear();
        col_2.clear();
    }
}
