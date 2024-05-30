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
import taskone.MainMenu;

/**
 *
 * @author Lalemi1980
 */
public class MainMenuTest {
    
    public MainMenuTest() {
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
     * Test of main method, of class MainMenu.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainMenu.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mainMenu method, of class MainMenu.
     */
    @Test
    public void testMainMenu() {
        System.out.println("mainMenu");
        MainMenu.mainMenu();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
