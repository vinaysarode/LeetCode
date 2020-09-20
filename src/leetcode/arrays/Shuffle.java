package leetcode.arrays;

import java.util.Arrays;

public class Shuffle {

	public static void main(String[] args) {
		int[] arr1 = {2,5,1,3,4,7};
		int[] arrResult = shuffle(arr1,3);
		System.out.println(Arrays.toString(arrResult));
	}
	
	  public static int[] shuffle(int[] nums, int n) {
		  	int[] shuffle =new int[nums.length];
		  	
		  	int intial = 0;
		  	int after = n;
		  	
		  	for (int i = 0; i < shuffle.length; i++) {
				if(i%2 == 0) {
					shuffle[i] = nums[intial++];
				}else {
					shuffle[i] = nums[after++];
				}
			}
		  	
	        return shuffle;
	    }

}
