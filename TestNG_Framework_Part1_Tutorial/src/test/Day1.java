package test; // This is the package name where the class belongs

import org.testng.Assert; // Importing Assert class from TestNG
import org.testng.annotations.AfterSuite; // Importing AfterSuite annotation from TestNG
import org.testng.annotations.AfterTest; // Importing AfterTest annotation from TestNG
import org.testng.annotations.Test; // Importing Test annotation from TestNG

public class Day1 { // Declaring a class named "Day1"

    @AfterTest // Indicating that this method will be executed after all test methods in the current <test> tag
    public void lastexecution() { // Defining the method named "lastexecution"
        System.out.println("I will execute last"); // Printing "I will execute last"
    }
    
    @Test // Indicating that this method is a TestNG test method
    public void Demo() { // Defining the test method named "Demo"
        System.out.println("hello"); // Printing "hello"
        //Assert.assertTrue(false); // Failing the test intentionally
    }
    
    @AfterSuite // Indicating that this method will be executed after all tests in the suite have run
    public void afSyite() { // Defining the method named "afSyite"
        System.out.println("I am the no 1 from last "); // Printing "I am the no 1 from last "
    }
    
    @Test // Indicating that this method is a TestNG test method
    public void SecondTest() { // Defining the test method named "SecondTest"
        System.out.println("bye"); // Printing "bye"
    }
}


/*
 @AfterTest: This annotation indicates that the annotated method will be executed after all test methods in the current <test> tag.
 
lastexecution method: This method prints "I will execute last" and serves as a cleanup 
method executed after all test methods in the <test> tag.

@Test: This annotation indicates that the annotated method is a TestNG test method.

Demo method: This test method prints "hello" and intentionally fails using Assert.assertTrue(false).

@AfterSuite: This annotation indicates that the annotated method will be executed after all tests in the suite have run.

afSyite method: This method prints "I am the no 1 from last" and serves as a cleanup method executed after all tests in the suite.

*/