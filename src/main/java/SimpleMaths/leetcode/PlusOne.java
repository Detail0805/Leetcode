package SimpleMaths.leetcode;

public class PlusOne {

	/**
	 * 66. Plus One
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,2,3};
		int[] c=new int[]{7,8,9};
		int[] b=new int[]{7,9,9};
		System.out.println(plusOne(b));
	}

	public static int[] plusOne(int[] digits) {
        int len=digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]<9){
                ++digits[i];
                return digits;
            }
            digits[i]=0;
        }
        int[] c=new int[len+1];
        c[0]=1;
        return c;
    }
}
