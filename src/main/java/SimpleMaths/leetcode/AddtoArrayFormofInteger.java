package SimpleMaths.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {
	/**
	 * 989. Add to Array-Form of Integer
	 */
	public static void main(String[] args) {
			//A = [1,2,0,0], K = 34
		int[] A =new int[]{1,2,0,0};
		int[] B =new int[]{2,1,5};
		addToArrayForm(B,806);
	}
	
	public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> answear =new ArrayList<Integer>();
        int len=A.length;
        int temp=K;//34
        while(--len>=0||temp>0){
        	if(len>=0)temp+=A[len];
        	answear.add(temp%10);
        	temp/=10;
        }
        Collections.reverse(answear);
        return answear;
    }
}
