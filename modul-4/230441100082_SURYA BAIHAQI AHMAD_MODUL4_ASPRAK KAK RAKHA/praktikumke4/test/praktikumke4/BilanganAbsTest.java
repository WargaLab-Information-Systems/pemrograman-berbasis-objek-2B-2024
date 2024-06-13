/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package praktikumke4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author H
 */
public class BilanganAbsTest {
    
    public BilanganAbsTest() {
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
     * Test of set_A method, of class BilanganAbs.
     */
    @Test
    public void testSet_A() {
        System.out.println("set_A");
        double a = 0.0;
        BilanganAbs instance = new BilanganAbsImpl();
        instance.set_A(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_B method, of class BilanganAbs.
     */
    @Test
    public void testSet_B() {
        System.out.println("set_B");
        double b = 0.0;
        BilanganAbs instance = new BilanganAbsImpl();
        instance.set_B(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_C method, of class BilanganAbs.
     */
    @Test
    public void testSet_C() {
        System.out.println("set_C");
        BilanganAbs instance = new BilanganAbsImpl();
        instance.set_C();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_A method, of class BilanganAbs.
     */
    @Test
    public void testGet_A() {
        System.out.println("get_A");
        BilanganAbs instance = new BilanganAbsImpl();
        double expResult = 0.0;
        double result = instance.get_A();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_B method, of class BilanganAbs.
     */
    @Test
    public void testGet_B() {
        System.out.println("get_B");
        BilanganAbs instance = new BilanganAbsImpl();
        double expResult = 0.0;
        double result = instance.get_B();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_C method, of class BilanganAbs.
     */
    @Test
    public void testGet_C() {
        System.out.println("get_C");
        BilanganAbs instance = new BilanganAbsImpl();
        double expResult = 0.0;
        double result = instance.get_C();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tampil method, of class BilanganAbs.
     */
    @Test
    public void testTampil() {
        System.out.println("tampil");
        BilanganAbs instance = new BilanganAbsImpl();
        instance.tampil();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BilanganAbsImpl extends BilanganAbs {

        public void set_A(double a) {
        }

        public void set_B(double b) {
        }

        public void set_C() {
        }

        public double get_A() {
            return 0.0;
        }

        public double get_B() {
            return 0.0;
        }

        public double get_C() {
            return 0.0;
        }

        public void tampil() {
        }
    }
    
}
