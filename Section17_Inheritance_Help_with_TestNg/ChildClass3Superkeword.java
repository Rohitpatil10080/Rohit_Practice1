package Section17_Inheritance_Help_with_TestNg;

public class ChildClass3Superkeword {
    
    int a; // This is where we store a number
    
    // Constructor: Sets the initial value of 'a' when we create a new object
    public ChildClass3Superkeword(int a) {
        this.a = a; // 'this' refers to the current object, and 'a' refers to the parameter passed to the constructor
    }

    // Method: Multiplies 'a' by three
    public int multiplicationByThree() {
        a = a * 3; // We use 'a' from the current object
        return a; // Returns the updated value of 'a'
    }
    
    // Method: Multiplies 'a' by four
    public int multiplicationByFour() {
        a = a * 4; // We use 'a' from the current object
        return a; // Returns the updated value of 'a'
    }
}

/*
1. **Class Name**: This is a class named `ChildClass3Superkeword`. It's like a container for some actions and data.

2. **Instance Variable**: Inside this container, there's a variable named `a`. It's like a box where you can keep a number.

3. **Constructor**: When you create a new container (an object) from this class, you can give it a number, and this number will be put into the `a` box.

4. **Methods**: Inside the container, there are two actions you can do:
   - `multiplicationByThree()`: If you have a number in the `a` box, this action will make it three times bigger.
   - `multiplicationByFour()`: If you have a number in the `a` box, this action will make it four times bigger.

5. **'this' Keyword**: We use the `this` keyword inside the constructor to refer to the current object. It helps us differentiate between the instance variable 'a' and the parameter 'a' passed to the constructor.
*/
