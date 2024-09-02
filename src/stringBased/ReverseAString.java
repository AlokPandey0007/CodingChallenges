package stringBased;

public class ReverseAString {
	
	public static void main(String [] args)
	{
	 String name="Ritesh";
	 
	 	String reversedString="";
	 	
	 	for(int i=name.length()-1;i>=0;i--)
	 	{
	 		reversedString=reversedString+name.charAt(i);
	 	}
	 	
	System.out.println("Reversed String is : "+reversedString);
	 
	}

}
