import java.util.ArrayList;

import org.apache.commons.lang.ArrayUtils;

public class FirstAndLastElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {1,1,4,43,3,6,2};
		
		searchRange(nums,1);
	}
	
	public static int[] searchRange(int[] nums, int target) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		int []index = new int[5];
		
		for(int i=0; i<=nums.length-1; i++) {
			
			if(nums[i]==target)
			{
				ArrayUtils.add(index, i);
			}
			
		}
		for (int j: index) {
		System.out.println(j);}

		return index;
        
    }

}
