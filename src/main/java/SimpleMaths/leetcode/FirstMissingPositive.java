package SimpleMaths.leetcode;


public class FirstMissingPositive {

	
	
	
	
	/**		   0,1,2
	 * Input: [1,2,0] Output: 3
	 *         0,1,2,3,4
	 * Input: [3,4,-1,1] Output: 2
	 * O(n)
	 * leetcode41
	 * bucket sort : 對�?��?�數就�?��?�去
	 */
	
	public static int first(int[] nums){
		if (nums == null || nums.length == 0)
			return 1;

		for(int i =0;i<nums.length;i++){
			while (nums[i]>0 && nums[i]<nums.length && nums[nums[i]-1]!=nums[i]){
				int temp =nums[nums[i]-1];
				nums[nums[i]-1]=nums[i];
				nums[i]=temp;
			}
		}
		for (int i=0;i<nums.length;i++){
			if(nums[i]!=i+1){
				return i+1;
			}
		}
		
		return nums.length + 1;
	}
	/**
	 * leetcode no1 solution
	 * Input: [1,2,0] Output: 3
	 *         0,1,2,3,4
	 * Input: [3,4,-1,1] Output: 2
	 */
	public static int no1(int[] nums){
		int missing = 1;
        int prev_missing = 0;
        while(prev_missing != missing) {
            prev_missing = missing;
            int i = 0;
            //			[1,2,0]
            //i 		 0 1 2
            //missing    1 2 3
            //in code    2 3 4
            while(i < nums.length) {
                if(nums[i] == missing) {
                    missing++;
                }
                i++;
            }
        }
        return missing;
	}
}
