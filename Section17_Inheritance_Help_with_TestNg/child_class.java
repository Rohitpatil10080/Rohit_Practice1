package Section17_Inheritance_Help_with_TestNg;

import org.testng.annotations.Test;



public class child_class extends ParentClass {
    
    @Test
    public void runThis() {
        // Call method from parent class
        dothis();
        
        // Create an object of ChildClass2 and initialize 'a' to 3
        childclass2 ch = new childclass2(3); 
        
        // Printing the result of incrementing 'a' using the 'increment' method of 'ch'
        System.out.println(ch.increment());
        
        // Printing the result of decrementing 'a' using the 'decrement' method of 'ch'
        System.out.println(ch.decrement());
        
        // Printing the result of multiplication by three directly on 'ch'
        System.out.println(ch.multiplicationByThree());
        
        // Printing the result of multiplication by four directly on 'ch'
        System.out.println(ch.multiplicationByThree());
    }

	
}



/*
 




1. **Package Declaration**: `package Inheritance_Help_with_TestNg;`
   - This line specifies that this Java file belongs to the package named `Inheritance_Help_with_TestNg`.

2. **Imports**:
   - `import org.testng.annotations.Test;`: This imports the `Test` annotation from the TestNG framework, allowing you to use it in your code.

3. **Class Definition**:
   - `public class child_class extends ParentClass {`: This declares a class named `child_class` which extends (inherits from) `ParentClass`. 
       This means `child_class` inherits all the non-private fields and methods from `ParentClass`.

4. **Test Annotation**:
   - `@Test`: This annotation indicates that the method annotated with it (`runthis()`) is a test method and should be executed by the TestNG framework.

5. **runthis() Method**:
   - This method is annotated with `@Test`, so it will be executed as a test case.
   - Inside this method, `dothis()` method is called. Since `child_class` extends `ParentClass`, it can directly call the `dothis()` method inherited from `ParentClass`.

6. **Comments**:
   - There are some commented-out lines in the code which show alternative ways to call the `dothis()` method:
     - `//ParentClass ps=new ParentClass();`: This line demonstrates creating an object of `ParentClass` and then calling the `dothis()` method using that object.
     - `//ps.dothis();`: This line calls the `dothis()` method using the object `ps` of `ParentClass`.

7. **Explanation**:
   - Inheritance allows a subclass (child_class) to inherit fields and methods from a superclass (ParentClass). By extending `ParentClass`, `child_class` inherits the `dothis()` method, so it can be called directly from `child_class`.
   - In the provided code, `child_class` calls the inherited `dothis()` method directly in its `runthis()` method.
   - The commented-out alternative demonstrates another way to call the `dothis()` method by creating an object of `ParentClass`.
   - Using inheritance simplifies code by allowing subclasses to reuse methods and fields from their parent class, promoting code reuse and reducing redundancy.


 
 */

//if we create object of parent class we no need to use extends keyword 

//public class child_class()
//{
//
////using object creation of parent class
//		ParentClass ps=new ParentClass();//
//		ps.dothis();
//		
//}
//}