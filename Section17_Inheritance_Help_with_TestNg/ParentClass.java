package Section17_Inheritance_Help_with_TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass {

    public void dothis() {
        System.out.println("i am here");
    }
    
    @BeforeMethod()
    public void Beforerun() {
        System.out.println("Run me first");
    }
    
    @AfterMethod()
    public void afterrun() {
        System.out.println("run me last");
    }

}