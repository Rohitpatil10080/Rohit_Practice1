
public class CoreJava_Burshup_4 {

	public static void main(String[] args) {


    /*WE can define a string in 2 way -String is an object that represent sequence of char
     * 
		1)String literal    = String s="Rohit";
		
		in String lateral multiple values with same name he wont create new object it will refer to old
		
		String s="Rohit";
		String s1="Rohit";
		
		
		2)String object-using new memory allocating operator  = String s=new String("Rohit")*/
		
		
		
		String s1=new String ("Rohit");
		

		String s="Rohul Sheety Academy";
		
		String[] splitarray=s.split("Sheety");
		
		
		System.out.println(splitarray[0]);
		System.out.println(splitarray[1]);
		System.out.println(splitarray[1].trim());
		
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
		
		
		
		
		
		
		
		
	}

}
