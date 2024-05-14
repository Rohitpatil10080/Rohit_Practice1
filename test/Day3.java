package test; // This is the package name where the class belongs

import org.testng.annotations.*; // Importing necessary annotations from the TestNG library

public class Day3 { // Declaring a class named "Day3"

    @BeforeClass // Executed before any test method in the class
    public void befoclas() {
        System.out.println("before executing any methods in the class"); // Printing a message
    }

    @Parameters({ "URL", "APIKeyUsername" }) // Declaring that this test method will receive parameters named "URL" and "APIKey/usrname"
    @Test // Indicating that this method is a TestNG test method
    public void WebloginCarLoan(String urlname,String key) { // Defining the test method with parameters "urlname" and "key"
    	
        // Selenium automation code
        System.out.println("weblogincar"); // Printing a message
        System.out.println(urlname); // Printing the received "urlname" parameter
        System.out.println(key); // Printing the received "key" parameter
    }

    @BeforeMethod // Executed before every test method in the class
    public void beforeevery() {
        System.out.println(" I will execute before every test method in day 3 class"); // Printing a message
    }

    @AfterMethod // Executed after every test method in the class
    public void afterevery() {
        System.out.println(" I will execute after  every test method in day 3 class"); // Printing a message
    }

    @AfterClass // Executed after all test methods in the class
    public void afteclas() {
        System.out.println("After executing all methods in the class"); // Printing a message
    }

    @Test(groups={"smoke"}) // Declaring that this test method belongs to the "Smoke" group
    public void MobileLogincarLoan() { // Defining the test method
        // Appium automation code
        System.out.println("Mobilelogincar"); // Printing a message
    }

    @BeforeSuite // Executed before any test suite starts
    public void Bfsuite() {
        System.out.println(" I am no 1"); // Printing a message
    }

    @Test(enabled=false) // This test method will not be executed
    public void MobilesignimcarLoan() {
        // Appium automation code
        System.out.println("Mobile SIGIN"); // Printing a message
    }

    @Test(dataProvider="getData") // Using a data provider named "getData" for this test method
    public void MobilesignoutcarLoan(String username,String password) { // Defining the test method with parameters "username" and "password"
        // Appium automation code
        System.out.println("Mobile SIGNOUT"); // Printing a message
        System.out.println(username); // Printing the received "username" parameter
        System.out.println(password); // Printing the received "password" parameter
    }

    @Test(dependsOnMethods={"WebloginCarLoan","MobilesignoutcarLoan"}) // This test method depends on the execution of other methods
    public void APIcarLoan() { // Defining the test method
        // Rest API automation code
        System.out.println("APIlogincar"); // Printing a message
    }

    @DataProvider // Providing test data for other test methods
    public Object[][] getData() { // Defining the data provider method
        // Defining test data in the form of a 2D array
        Object[][] data= new Object[3][2]; // Creating a 2D array with 3 rows and 2 columns

        // 1st set of test data
        data[0][0]="firstsetusername"; // Setting the username for the first set
        data[0][1]="firstpassword"; // Setting the password for the first set

        // 2nd set of test data
        data[1][0]= "secondsetusername"; // Setting the username for the second set
        data[1][1]= "secondpassword"; // Setting the password for the second set

        // 3rd set of test data
        data[2][0]="thirdsetusername"; // Setting the username for the third set
        data[2][1]="thirdpassword"; // Setting the password for the third set

        return data; // Returning the test data
    }
}






/*Explanation:
- **import statements**: Importing necessary classes from the TestNG library.

- **@BeforeClass**: Executed before any test method in the class.

- **@Parameters**: Indicates that the test method will receive parameters from the testng.xml file.

- **@Test**: Indicates that the method is a TestNG test method.

- **WebloginCarLoan method**: Receives parameters "urlname" and "key" and performs web login for a car loan.

- **@BeforeMethod**: Executed before every test method in the class.

- **@AfterMethod**: Executed after every test method in the class.

- **@AfterClass**: Executed after all test methods in the class.

- **@BeforeSuite**: Executed before any test suite starts.

- **@Test(enabled=false)**: This test method will not be executed.

- **@Test(dataProvider="getData")**: Using a data provider named "getData" for this test method.

- **@DataProvider**: Provides test data for other test methods.

- **getData method**: Defines test data in the form of a 2D array.

*/