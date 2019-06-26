package SimpleMaths.leetcode;


/**
 * 509. Fibonacci Number
 * @author user
 *
 */
public class fib {

	public static void main(String[] args) {
		fib(15);
	}
	
	
	public static  int fib(int N) {
	      if (N <= 0) return 0;
	      if (N == 1) return 1;
	        Integer first=0,second =1;
	        for(int i=2; i <=N ;i++){
	            int third = first + second;
	            first = second;
	            second = third;
	        }       
	        return second;
	    }
}
