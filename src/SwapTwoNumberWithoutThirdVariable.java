import java.lang.System;

public class SwapTwoNumberWithoutThirdVariable {
	
	public static void main(String [] args)
	{
	 int x=10;
	 int y=20;
	 System.out.println("Before swapping x is : "+x+ " and y is : "+y);
	 
	 x=x+y;
	 y=x-y;
	 x=x-y;
	 System.out.println("After swapping x is : "+x+ " and y is : "+y);
	 
	}

}
