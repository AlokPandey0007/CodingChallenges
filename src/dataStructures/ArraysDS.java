package dataStructures;

import java.util.Arrays;
import java.util.List;

public class ArraysDS {
	
	//Initializations
	static int[] a;   //declaration
	static int [] b;
	static int c[];
	static int d[]=new int[5]; //instantiation
	
	public static void main(String [] args)
	{
		a=new int[6];
		
		//filling values in the array
		a[0]=2; //initialization
		a[1]=4;
		a[2]=6;
		
		//read one element
		System.out.println(a[2]);
		
		//read all elements
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//change element
		a[1]=5;
		
		//Common methods
		
		
		//performing binary search
		int[] numbers = {1, 3, 5, 7, 9};
		int index = Arrays.binarySearch(numbers, 5); // Returns 2

		//copy old array to new with new capacity
		int[] original = {1, 2, 3};
		int[] copy = Arrays.copyOf(original, 5); // {1, 2, 3, 0, 0}

		
		//converting array to list
		String[] names = {"Alice", "Bob", "Charlie"};
		List<String> nameList = Arrays.asList(names);

		
		//copy from one array to other
		int[] original1 = {1, 2, 3, 4, 5};
		int[] rangeCopy = Arrays.copyOfRange(original1, 1, 4); // {2, 3, 4} take inout as original array and start and end index
		
		
		//array comparision
		int[] array1 = {1, 2, 3};
		int[] array2 = {1, 2, 3};
		boolean isEqual = Arrays.equals(array1, array2); // true


		//sorting the array
		int[] array = {5, 3, 8, 1, 2};
		Arrays.sort(array); // {1, 2, 3, 5, 8}

		
		
		//java.util.Arrays method
		
		Arrays.fill(d, 5); // fill the same value in all index of array
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		
		//Finds and returns the index of the first unmatched element between two arrays.
		int[] array3 = {1, 2, 3};
		int[] array4 = {1, 2, 4};
		int mismatchIndex = Arrays.mismatch(array3, array4); // Returns 2


	}
	
	
	
	

}
