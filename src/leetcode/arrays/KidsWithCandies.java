package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {

	public static void main(String[] args) {
		int[] arr1 = {2,3,5,1,3};
		int[] arr2 = {4,2,1,1,2};
		int[] arr3 = {12,1,12};
		
		System.out.println(kidsWithCandies(arr1, 3));
		System.out.println(kidsWithCandies(arr2, 1));
		System.out.println(kidsWithCandies(arr3, 10));

	}
	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		  int max = candies[0];
		  for (int i = 0; i < candies.length; i++) {
			if(candies[i] > max) {
				max = candies[i];
			}
		}
		  
		  List<Boolean> result = new ArrayList<Boolean>();
		  
		  for (int i = 0; i < candies.length; i++) {
			if(candies[i] + extraCandies < max) {
				result.add(false);
			}else {
				result.add(true);
			}
		}
	       return result; 
	    }

}
