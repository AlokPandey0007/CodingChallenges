package twoPointerProblems;

import java.util.Iterator;

//Problem - move all the zeros from an array to end by keeping the non zero element to their relative position


public class MoveZeros {

	static int[] nums = {5,0,8,0, 1, 0, 3, 12 };

	public static void main(String[] args) {
		int left=0;
		for(int i=0;i<nums.length;i++)
		{
			
			if(nums[i]==0)
			{
				
				continue;
			}
			else {
				int temp =nums[left];
				nums[left]=nums[i];
				nums[i]=temp;
				left++;
				
			}
		}
		
		for (int z = 0; z < nums.length; z++) {
			System.out.println(nums[z]);
		}

	}

}
