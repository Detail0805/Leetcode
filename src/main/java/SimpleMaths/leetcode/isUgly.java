package SimpleMaths.leetcode;

public class isUgly {

	/**
	 * 263. Ugly Number
	 */
	public static void main(String[] args) {
		isUgly(8);
	}

	
    public static boolean isUgly(int num) {
        if(num==0){
            return false;
        }
        int a =num%2;
        int b =num%3;
        int c =num%5;
        
        while(a==0 || b ==0 ||c ==0){
          if(a==0){
              num=num/2;
          }else if (b==0){
              num=num/3;
          }else if (c==0){
              num=num/5;
          }
              a=num%2;
              b=num%3;
              c=num%5;
        }
                
        return num==1;
    }
}
