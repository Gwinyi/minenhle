/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TaskOne;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import taskone.Login;

/**
 *
 * @author Lalemi1980
 */
public class LoginTest {
    
    public LoginTest() {
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
     * Test of performLogin method, of class Login.
     */
    @Test
    public void testPerformLogin() {
        System.out.println("performLogin");
        Login instance = null;
        instance.performLogin();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRegisteredUN method, of class Login.
     */
    @Test
    public void testGetRegisteredUN() {
        System.out.println("getRegisteredUN");
        Login instance = null;
        String expResult = "";
        String result = instance.getRegisteredUN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRegisteredPW method, of class Login.
     */
    @Test
    public void testGetRegisteredPW() {
        System.out.println("getRegisteredPW");
        Login instance = null;
        String expResult = "";
        String result = instance.getRegisteredPW();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
