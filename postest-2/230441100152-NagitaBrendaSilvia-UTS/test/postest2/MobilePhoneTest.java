/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package postest2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class MobilePhoneTest {
    
    public MobilePhoneTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of displayTotalStock method, of class MobilePhone.
     */
    @Test
    public void testDisplayTotalStock() {
        System.out.println("displayTotalStock");
        MobilePhone.displayTotalStock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayInfo method, of class MobilePhone.
     */
    @Test
    public void testDisplayInfo() {
        System.out.println("displayInfo");
        MobilePhone instance = null;
        instance.displayInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStock method, of class MobilePhone.
     */
    @Test
    public void testUpdateStock() {
        System.out.println("updateStock");
        int i = 0;
        MobilePhone instance = null;
        instance.updateStock(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
