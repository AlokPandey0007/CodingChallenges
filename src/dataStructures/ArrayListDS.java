package dataStructures;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDS {
	
	public static void main(String [] args)
	{
		//collection
		ArrayList az = new ArrayList();
		
		
		//generic collection
		ArrayList<Integer> a= new ArrayList();
	
		//add element
		a.add(5);
		a.add(8);
		a.add(9);
		a.add(14);
		
		a.stream().forEach(x-> System.out.println(x));
		//remove element
		a.remove(0); //input as index
		
		//update element
		a.add(2, 10);
		
		//read element 
		System.out.println(a.get(2));
		
		//read all element
		a.stream().forEach(x-> System.out.println(x));
		
		
		
		
		
		
		
	}

}
