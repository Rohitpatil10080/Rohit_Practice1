package Section17_Inheritance_Help_with_TestNg;

public class childclass2 extends ChildClass3Superkeword {
    
    int a; // Declaration of instance variable 'a'
    
    // Constructor: Initializes 'a' with the value passed as an argument and calls the superclass constructor
    public childclass2(int a) {
        super(a); // Call the superclass constructor to set the initial value of 'a'
        this.a = a; // Initialize 'a' in the subclass
    }

    // Method: Increment 'a' by 1 and return the updated value
    public int increment() {
        a = a + 1; // Increment 'a'
        return a; // Return the updated value of 'a'
    }
    
    // Method: Decrement 'a' by 1 and return the updated value
    public int decrement() {
        a = a - 1; // Decrement 'a'
        return a; // Return the updated value of 'a'
    }
}

/*
1. **Class Name**: This class is called `childclass2`. It's like a blueprint for creating objects with certain behaviors and data.

2. **Instance Variable**: It has a variable called `a`. Think of it as a container that holds a number. Each object made from this 
class will have its own `a` with its own number.

3. **Constructor**: When we create a new object from this class, we use a special method called a constructor. 
     This constructor takes a number as input and sets the value of `a` to that number. It also calls the constructor of the superclass 
     `ChildClass3Superkeword` using the `super` keyword to initialize the superclass variables.

4. **Inheritance**: This class extends another class called `ChildClass3Superkeword`. It means `childclass2` gets all the behaviors and data from 
                    `ChildClass3Superkeword` and can also have its own unique behaviors.

5. **Methods**: It has two methods: `increment()` and `decrement()`. These methods change the value of `a`. `increment()` makes `a` one bigger, 
               and `decrement()` makes `a` one smaller.

6. **Superclass and `super` Keyword**: The superclass `ChildClass3Superkeword` is a class that `childclass2` 
     inherits from. We use the `super` keyword to call the constructor of the superclass. This allows us to reuse code from the superclass 
      and initialize its variables properly.
*/
