package SimpleMaths.leetcode;

import java.util.Arrays;

/**
 * 283. Move Zeroes
 */
public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums=new int[]{0,0,2,3,0,5};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	//Assign version
	public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int slow = 0;
        for (int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=0){
               nums[slow]=nums[fast];
              slow++;
            }
        }
      for (int i = slow; i < nums.length; ++i){//waste operation
    	  nums[i] = 0;
      		}
		}
	//Swap version 
	public static void moveZeroesSwap(int[] nums){
		if(nums==null|| nums.length ==0)return;
		int slow = 0;
		for(int fast = 0; fast < nums.length; fast++){
			if(nums[fast]!=0){
				int temp=nums[slow];
				nums[slow]=nums[fast];
				nums[fast]=temp;
				slow++;
				}
			}
		}
	}
