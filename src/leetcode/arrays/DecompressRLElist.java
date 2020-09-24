package leetcode.arrays;

import java.util.Arrays;

public class DecompressRLElist {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arrResult = decompressRLElist(arr1);
		System.out.println(Arrays.toString(arrResult));
	}
	
	 public static int[] decompressRLElist(int[] nums) {
	        int len = 0;
	        for(int i = 0; i < nums.length ; i+=2) {
	        	len = len + nums[i];
	        }
	        
	        int[] ans= new int[len];
	        int index = 0;
	        
	        for(int i = 1; i < nums.length ; i+=2) {
	        	for(int j = 0;j < nums[i-1]; j++ )
	        	{
	        		ans[index++] = nums[i];
	        	}
	        }
	        
	        return ans;
	    }
}
