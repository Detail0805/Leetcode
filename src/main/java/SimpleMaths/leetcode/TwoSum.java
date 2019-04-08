package SimpleMaths.leetcode;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		
		int[] aaa=new int[]{3,2,4};
		sum2(aaa,6);
		
		
	}
	//O(n^2)
	public static int[] sum1(int[] nums,int target){
		for(int i =0 ;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if((nums[i]+nums[j])==target){
					return new int[]{i,j};
				}
			}
		}
		return new int[]{-1,-1};
	}
	//Time: O(n), Space: O(n) [2,7,11,15]
	public static int[] sum2(int[] nums,int target){
		HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(a.get(nums[i])==null){
				a.put(target-nums[i], i);
			}else{
				return new int[]{a.get(nums[i]),i};
			}
			
		}
		return new int[]{-1,-1};
	}
}
