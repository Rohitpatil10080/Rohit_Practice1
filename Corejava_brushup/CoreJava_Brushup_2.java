package Corejava_brushup;

public class CoreJava_Brushup_2 {

<<<<<<< HEAD
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 122, 22, 33, 44, 3, 2};

        // Loop through the array elements
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is divisible by 2
            if (arr[i] % 2 == 0) {
                // Print the element if it's divisible by 2
                System.out.println(arr[i]);
                // Exit the loop once the condition is satisfied
                break;
            } else {
                // Print a message if the element is not divisible by 2
                System.out.println("it is not multiple of 2");
            }
        }
    }
=======
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {1,2,4,5,6,7,8,9,122,22,33,44,3,2};
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]% 2==0)
			{
				System.out.println(arr[i]);
				break;//once condition satisfied it will exit from the loop
			}
			else
			{
				System.out.println("it is not multiple of 2");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

>>>>>>> ad518d8cfaaf54beac8809fe1c68a5b538aa31c6
}
