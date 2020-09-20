package leetcode.arrays;

import java.util.Arrays;

public class RunningSumOfArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] arr1 = {1,1,1,1,1};
		int[] arr2 = {3,1,2,10,1};
		
		int[] arrResult = runningSum(arr);
		int[] arrResult1 = runningSum(arr1);
		int[] arrResult2 = runningSum(arr2);
		System.out.println(Arrays.toString(arrResult));
		System.out.println(Arrays.toString(arrResult1));
		System.out.println(Arrays.toString(arrResult2));
	}
	
	public static int[] runningSum(int[] nums) {
		//Solution #1
//		int sum = 0;
//		
//		for (int i = 0; i < nums.length; i++) {
//			if(i == 0) {
//				sum = nums[0];
//			}else {
//				sum = sum + nums[i];
//				nums[i] = sum;
//			}
//		}
		
		//Solution #2
		
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i-1];
		}
		
		return nums;
	}
}
