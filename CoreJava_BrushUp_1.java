
public class CoreJava_BrushUp_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		String website = "Rahul shetty academy";
		char letter='r';
		float dec = 5.99f;
		boolean mycard = true;
		
		
		System.out.println(num + " this is my number");
		System.out.println(website);
		
		//Array
		
		//We can store an array in two way
		
		int[] arr=new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] arr2= {1,2,3,4,5,6,8,9,122,156,173,722};
		
		System.out.println(arr2[3]);
		
		//for loop
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int n :arr)
		{
			System.out.println(n);
		}
		
		for(int i=0; i<arr2.length; i++) {
			
			
			System.out.println(arr2[i]);
		}
		
		
		String[] name= {"Rohit","Asmit","Somu"};
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		//second way for loop
		
		for(String s:name)
		{
			System.out.println(s);
		}
				

	}

}
