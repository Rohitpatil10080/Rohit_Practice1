package Corejava_brushup;

public class CoreJava_BrushUp_1 {

    public static void main(String[] args) {
        // Declare and initialize variables
        int num = 5;
        String website = "Rahul shetty academy";
        char letter = 'r';
        float dec = 5.99f;
        boolean mycard = true;

        // Print variables
        System.out.println(num + " this is my number");
        System.out.println(website);

        // Array
        // Declare and initialize an array
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // Declare and initialize an array using shorthand
        int[] arr2 = {1, 2, 3, 4, 5, 6, 8, 9, 122, 156, 173, 722};

        // Access and print elements of the array using index
        System.out.println(arr2[3]);

        // Print elements of the array using a for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Enhanced for loop to print elements of the array
        for (int n : arr) {
            System.out.println(n);
        }

        // Print elements of arr2 using a for loop
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // Declare and initialize a String array
        String[] name = {"Rohit", "Asmit", "Somu"};

        // Print elements of the String array using a for loop
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        // Enhanced for loop to print elements of the String array
        for (String s : name) {
            System.out.println(s);
        }
    }
}
