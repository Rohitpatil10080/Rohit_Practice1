
package Scetion14_Java_Streams; // Declares the package name

import java.util.ArrayList; // Imports ArrayList class from java.util package
import java.util.Arrays; // Imports Arrays class from java.util package
import java.util.List; // Imports List interface from java.util package
import java.util.stream.Collectors; // Imports Collectors class from java.util.stream package
import java.util.stream.Stream; // Imports Stream class from java.util.stream package

import org.testng.Assert; // Imports Assert class from TestNG library
import org.testng.annotations.Test; // Imports Test annotation from TestNG library

public class Test1 { // Defines a class named Test1

	public static void main(String[] args) { // Main method, entry point of the program

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

		for (int i = 0; i < names.size(); i++) { // Loop through each element of the ArrayList
			String actual = names.get(i); // Get the name at index i

			// Counting the names starting with "R"
			if (actual.startsWith("R")) { // Check if the name starts with "R"
				count++; // Increment the count
			}
		}

		// Printing the count of names starting with "R"
		System.out.println("Number of names starting with 'R': " + count);
	}

	// Method to count names starting with "R" using Stream API
	
	@Test
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

		// names.stream().filter(s-> s.length() > 4).forEach(s-> System.out.println(s));

		// print names of length>4 as uppercase

		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	@Test
	public void streammap() { // Test method for demonstrating stream mapping

		ArrayList<String> names = new ArrayList<String>(); // Creating an ArrayList to store names

		names.add("man"); // Adding names to the ArrayList
		names.add("Don");
		names.add("women");

		// print names of length>4 as last name "a" uppercase

		Stream.of("Rohit", "Rahula", "sagar", "Ramesh", "Asmita").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// print names which have last letter "a" with uppercase and

		Stream.of("Rohit", "RahulA", "sagar", "Ramesh", "Asmita").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// print names which have first letter "a" with uppercase and sorted

		List<String> names1 = Arrays.asList("Rohit", "Rahula", "sagar", "Ramesh", "Asmita");
		names1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// merging two different lists

		Stream<String> newstream = Stream.concat(names.stream(), names1.stream());
		// newstream.sorted().forEach(s->System.out.println(s));

		boolean flag = newstream.anyMatch(s -> s.equalsIgnoreCase("Ramesh"));

		Assert.assertTrue(flag); // Asserting that "Ramesh" exists in the combined stream

	}

	@Test
	public void streamCollect() { // Test method for demonstrating stream collection

		List<String> ls = Stream.of("Rohit", "RahulA", "sagar", "Ramesh", "Asmita").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList()); // Collecting elements into a List
		System.out.println(ls.get(0)); // Printing the first element of the list

		int[] values = { 1, 3, 4, 3, 5, 1, 6, 7 };

		List<Integer> values1 = Arrays.asList(1, 3, 4, 3, 5, 1, 6, 7);

		values1.stream().distinct().forEach(s -> System.out.println(s));

		// print unique number from this array
		// sort the array

		List<Integer> li = values1.stream().distinct().sorted().collect(Collectors.toList());

		System.out.println(li.get(3));

	}

}

/*

1. **filter**: It's like using a sieve to sift out what you want. For instance, if you have a list of names, you can use filter to only get names that start with 'R'. Example:
   java
   List<String> names = Arrays.asList("Rohit", "John", "Rachel", "Sagar");
   List<String> filteredNames = names.stream().filter(name -> name.startsWith("R")).collect(Collectors.toList());
   // Output: ["Rohit", "Rachel"]
   

2. **map**: Think of it as a magic wand that changes things. For instance, if you want to convert a list of words to uppercase, you can use map. Example:
   ```java
   List<String> words = Arrays.asList("hello", "world", "java");
   List<String> upperCaseWords = words.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
   // Output: ["HELLO", "WORLD", "JAVA"]
   

3. **forEach**: It's like going through a list one by one and doing something with each item. For instance, printing each element of a list. Example:
   ```java
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
   numbers.stream().forEach(num -> System.out.println(num));
   // Output:
   // 1
   // 2
   // 3
   // 4
   // 5
   

4. **distinct**: Imagine removing duplicate items from a list. Example:
      java
   List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
   List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
   // Output: [1, 2, 3, 4, 5]
 

5. **sorted**: It's like arranging items in order from smallest to largest or from A to Z. Example:
   java
   List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
   List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
   // Output: [1, 2, 3, 4, 5]
   ```

6. **collect**: It's like gathering things together. Example:
   ```java
   List<String> words = Arrays.asList("hello", "world", "java");
   String collectedWords = words.stream().collect(Collectors.joining(", "));
   // Output: "hello, world, java"
   ```

7. **concat**: It's like combining two lists into one. Example:
   ```java
   List<String> list1 = Arrays.asList("apple", "banana");
   List<String> list2 = Arrays.asList("orange", "grape");
   Stream<String> combinedStream = Stream.concat(list1.stream(), list2.stream());
   List<String> combinedList = combinedStream.collect(Collectors.toList());
   // Output: ["apple", "banana", "orange", "grape"]
   ```

8. **anyMatch**: It's like asking if at least one thing matches a condition. Example:
   ```java
   List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape");
   boolean hasBanana = fruits.stream().anyMatch(fruit -> fruit.equals("banana"));
   // Output: true
  
*/