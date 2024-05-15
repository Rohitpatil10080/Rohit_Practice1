package test; // This is the package name where the class belongs

import org.testng.annotations.BeforeTest; // Importing BeforeTest annotation from TestNG
import org.testng.annotations.Test; // Importing Test annotation from TestNG

public class Day2 { // Declaring a class named "Day2"

    @Test(groups={"smoke"}) // Indicating that this method is a TestNG test method and belongs to the "Smoke" group
    public void ploan() { // Defining the test method named "ploan"
        System.out.println("good"); // Printing "good"
    }

    @BeforeTest // Indicating that this method will be executed before any test in the current <test> tag
    public void prerequiste() { // Defining the method named "prerequiste"
        System.out.println("I will execute first"); // Printing "I will execute first"
    }
}

/*


Explanation:

- **@BeforeTest**: This annotation indicates that the annotated method will be executed before any test method 
belonging to the current `<test>` tag.

- **prerequiste method**: This method prints "I will execute first" and serves as a prerequisite 
method executed before any test method in the `<test>` tag.

- **@Test(groups={"Smoke"})**: This annotation indicates that the annotated method is a TestNG test method and belongs to the "Smoke" group.
- **ploan method**: This method prints "good" and is a part of the "Smoke" group of tests.

*/