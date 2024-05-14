
package test;

import org.testng.annotations.Parameters; // Importing the Parameters annotation from TestNG library
import org.testng.annotations.Test; // Importing the Test annotation from TestNG library

public class Day4 {

    @Parameters({ "URL" }) // Declaring that this test method will receive a parameter named "URL"
    @Test // Declaring that this is a TestNG test method
    public void WebloginHomeLoan(String URL) // Defining the test method with a parameter "URL"
    {
        // Selenium automation code
        System.out.println("webloginhomePersonalLoan"); // Printing a message indicating web login for personal loan
        System.out.println(URL); // Printing the received URL parameter
    }

    @Test(groups={"smoke"}) // Declaring that this test method belongs to the "Smoke" group
    public void MobileLoginHomeLoan() // Defining the test method
    {
        // Appium automation code
        System.out.println("MobileloginHome"); // Printing a message indicating mobile login
    }

    @Test // Declaring that this is a TestNG test method
    public void LoginAPIHomeLoan() // Defining the test method
    {
        // Rest API automation code
        System.out.println("APIloginHome"); // Printing a message indicating API login
    }
}

/*Explanation:
- **import statements**: These lines import necessary classes from TestNG library.

- **@Parameters annotation**: Indicates that the test method will receive parameters from the testng.xml file.

- **@Test annotation**: Indicates that the method is a TestNG test method.

- **WebloginHomeLoan method**: Receives a parameter named "uname" and prints a message indicating web login for personal loan along with the URL parameter received.
- **MobileLoginHomeLoan method**: Prints a message indicating mobile login.

- **LoginAPIHomeLoan method**: Prints a message indicating API login.

*/