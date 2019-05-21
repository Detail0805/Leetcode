package SimpleMaths.leetcode;

import java.util.HashSet;
import java.util.Set;

public class singleNumberWithSet {

	/**
	 * 136. Single Number
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a=new int[]{5, 7, 5, 6, 6};
		singleNumberWithSet(a);
	}
	
	  // Time: O(n), Space: O(n)
	  public static int singleNumberWithSet(int[] nums) {
	    Set<Integer> set = new HashSet<Integer>();
	    int sum = 0, uniqueSum = 0;
	    for (int num: nums) {
	      if (!set.contains(num)) {
	        uniqueSum += num;// 5 5 6 6 7
	        set.add(num);
	      }
	      sum += num;
	    }
	    return 2 * uniqueSum - sum;
	  }

}
