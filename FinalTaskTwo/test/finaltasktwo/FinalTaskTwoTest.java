/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package finaltasktwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lalemi1980
 */
public class FinalTaskTwoTest {
    
    public FinalTaskTwoTest() {
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
     * Test of isCheckTaskDescrption method, of class FinalTaskTwo.
     */
    @Test
    public void testIsCheckTaskDescrption() {
        System.out.println("isCheckTaskDescrption");
        String taskName = "";
        FinalTaskTwo instance = new FinalTaskTwo();
        boolean expResult = false;
        boolean result = instance.isCheckTaskDescrption(taskName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isCheckTaskDescription method, of class FinalTaskTwo.
     */
    @Test
    public void testIsCheckTaskDescription() {
        System.out.println("isCheckTaskDescription");
        FinalTaskTwo instance = new FinalTaskTwo();
        boolean expResult = false;
        boolean result = instance.isCheckTaskDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCheckTaskDescription method, of class FinalTaskTwo.
     */
    @Test
    public void testSetCheckTaskDescription() {
        System.out.println("setCheckTaskDescription");
        boolean checkTaskDescription = false;
        FinalTaskTwo instance = new FinalTaskTwo();
        instance.setCheckTaskDescription(checkTaskDescription);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCreateTaskID method, of class FinalTaskTwo.
     */
    @Test
    public void testGetCreateTaskID_4args() {
        System.out.println("getCreateTaskID");
        String taskName = "";
        int taskNumber = 0;
        String taskDev = "";
        String taskID = "";
        FinalTaskTwo instance = new FinalTaskTwo();
        String expResult = "";
        String result = instance.getCreateTaskID(taskName, taskNumber, taskDev, taskID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCreateTaskID method, of class FinalTaskTwo.
     */
    @Test
    public void testGetCreateTaskID_0args() {
        System.out.println("getCreateTaskID");
        FinalTaskTwo instance = new FinalTaskTwo();
        String expResult = "";
        String result = instance.getCreateTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCreateTaskID method, of class FinalTaskTwo.
     */
    @Test
    public void testSetCreateTaskID() {
        System.out.println("setCreateTaskID");
        String createTaskID = "";
        FinalTaskTwo instance = new FinalTaskTwo();
        instance.setCreateTaskID(createTaskID);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPrintTaskDetails method, of class FinalTaskTwo.
     */
    @Test
    public void testGetPrintTaskDetails() {
        System.out.println("getPrintTaskDetails");
        String taskStatus = "";
        String taskDetails = "";
        int taskNumber = 0;
        String taskName = "";
        String taskDemo = "";
        String taskID = "";
        int taskDuration = 0;
        String expResult = "";
        String result = FinalTaskTwo.getPrintTaskDetails(taskStatus, taskDetails, taskNumber, taskName, taskDemo, taskID, taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setPrintTaskDetails method, of class FinalTaskTwo.
     */
    @Test
    public void testSetPrintTaskDetails() {
        System.out.println("setPrintTaskDetails");
        String printTaskDetails = "";
        FinalTaskTwo instance = new FinalTaskTwo();
        instance.setPrintTaskDetails(printTaskDetails);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getReturnTotalHours method, of class FinalTaskTwo.
     */
    @Test
    public void testGetReturnTotalHours_int_int() {
        System.out.println("getReturnTotalHours");
        int taskDuration = 0;
        int totalHours = 0;
        FinalTaskTwo instance = new FinalTaskTwo();
        int expResult = 0;
        int result = instance.getReturnTotalHours(taskDuration, totalHours);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getReturnTotalHours method, of class FinalTaskTwo.
     */
    @Test
    public void testGetReturnTotalHours_int() {
        System.out.println("getReturnTotalHours");
        int returnTotalHours = 0;
        FinalTaskTwo instance = new FinalTaskTwo();
        instance.getReturnTotalHours(returnTotalHours);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
