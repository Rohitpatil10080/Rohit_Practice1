import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava_Brushup_3 {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Rohit");
		a.add("Asmit");
		a.add("Prashant");
		a.add("Vishal");
    
		
		System.out.println(a.get(3));
		
		//when we use arrylist we can use size method not length
		
		for(int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		for(String s :a)
		{
			System.out.println(s);

		}
		
		//item is present in arraylist or not check
		
		System.out.println(a.contains("selenium"));
		
		//convert array to arraylist
		
		String[] name= {"rohit","akash","selenium"};
		List<String> arraylistconvert = Arrays.asList(name);
		System.out.println(arraylistconvert.contains("selenium"));
	}

}
