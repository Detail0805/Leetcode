package SimpleMaths.leetcode;


/**
 * 746. Min Cost Climbing Stairs
 */

public class MinCostClimbingStairs {

	/**
	 * Input: cost = [10, 15, 20] Output: 15
	 * Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1] Output: 6
	 */
	public static void main(String[] args) {
		int [] cost= new int[] {10, 15, 20};
		int [] cost2= new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
//		System.out.println(MinCostClimbingStairs.minCostClimbingStairs(cost));
		System.out.println(MinCostClimbingStairs.minCostClimbingStairs(cost2));
	}

	
	//time O(n) space O(n)
    public static int minCostClimbingStairs(int[] cost) {
        int length = cost.length + 1;
        int[] dp = new int[length];//用來儲存的新數組
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < length; i++) {
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        return dp[length - 1];
        
    }
    
	//time O(n) space O(1) 跟爬樓梯那題一樣
    public static int minCostClimbingStairs2(int[] cost) {
    	int length= cost.length+1;
    	int dp0=0; int dp1=0; int dp2=0;
    	for (int i = 2; i < length; i++) {
    		dp2=Math.min(dp0+cost[i-2],dp1+cost[i-1]);
    		dp0=dp1;
    		dp1=dp2;
    	}
        return dp2;
    }
    
}
