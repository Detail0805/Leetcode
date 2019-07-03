package SimpleMaths.leetcode;

/**
 * 70. Climbing Stairs
 */

public class climbStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs.climbStairs(15));
		System.out.println(climbStairs.climbStairs2(15));
	}

	
	public static int climbStairs(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        int one=1;
        int two=2;
        int all=0;
        for(int i=2;i<n;i++){
            all=one+two;
            one=two;
            two=all;
        }
        return all;
	}
	//DP
	public static int climbStairs2(int n) {
		int[] counts=new int[n+1];
		counts[0]=1;
		counts[1]=1;
		for(int i=2;i<=n;i++) {
			counts[i]=counts[i-1]+counts[i-2];
		}
		return counts[n];
	}
	
}
