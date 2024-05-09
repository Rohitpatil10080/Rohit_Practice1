package Scetion14; // Package declaration for Section14

import java.util.ArrayList; // Importing ArrayList class from java.util package
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream; // Importing Stream class from java.util.stream package

import org.testng.annotations.Test;

public class Test1 {

    public static void main(String[] args) {
        
        // Creating an ArrayList to store names
        ArrayList<String> names = new ArrayList<String>();

        // Adding names to the ArrayList
        names.add("Rohit");
        names.add("Rahul");
        names.add("sagar");
        names.add("Ramesh");
        names.add("Asmit");
        
        // Variable to count names starting with "R"
        int count = 0;

        // Iterating through the ArrayList to count names starting with "R"
        for (int i = 0; i < names.size(); i++) {
            String actual = names.get(i); // Getting the name at index i

            // Counting the names starting with "R"
            if (actual.startsWith("R")) {
                count++;
            }
        }

        // Printing the count of names starting with "R"
        System.out.println("Number of names starting with 'R': " + count);
    }

    // Method to count names starting with "R" using Stream API
    public void streamFilter() {
        
        // Creating an ArrayList to store names
        ArrayList<String> names = new ArrayList<String>();

        // Adding names to the ArrayList
        names.add("Rohit");
        names.add("Rahul");
        names.add("sagar");
        names.add("Ramesh");
        names.add("Asmit");
        
        // Using Stream API to filter and count names starting with "R"
        long c = names.stream().filter(s -> s.startsWith("R")).count();

        // Printing the count of names starting with "R" using Stream API
        System.out.println("Using StreamFilter method: " + c);
        
        // Using Stream API directly to filter and count names starting with "R"
        long d = Stream.of("Rohit", "Rahul", "sagar", "Ramesh", "Asmit").filter(s -> s.startsWith("R")).count();
        System.out.println("Using Stream API directly: " + d);
        
        // Printing all names from the ArrayList whose length is greater than 4
      //  names.stream().filter(s-> s.length() > 4).forEach(s-> System.out.println(s));
       

    	//print names of length>4 as uppercase
        names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
    }
    @Test
    public void streammap()
    {
    	
    	//print names of length>4 as last name "a" uppercase
    	
    	Stream.of("Rohit", "Rahula", "sagar", "Ramesh", "Asmita").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
    	
    	
    	//print names which have last letter "a" with uppercase and 
    	
    	
   Stream.of("Rohit", "Rahula", "sagar", "Ramesh", "Asmita").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
   
   
	//print names which have first letter "a" with uppercase and sorted
   
   List<String>names=Arrays.asList("Rohit", "Rahula", "sagar", "Ramesh", "Asmita");
   names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
       
    }

}