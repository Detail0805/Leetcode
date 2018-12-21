package SimpleMaths.leetcode;


/**
 * leetcode 299. Bulls and Cows
 * @author user
 *
 */
public class BullsandCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BullsandCows.BullsandCows("1532","1234"));
	}

	/**
	 * 299. Bulls and Cows
	 * Input: secret = "1807", guess = "7810"
	 * Output: "1A3B"
	 * Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
	 */
//1532  1234
	public static String  BullsandCows(String secret, String guess) {
	       int bulls = 0;
	        int cows = 0;
	        int[] numbers = new int[10];
	        for (int i = 0; i<secret.length(); i++) {
	            if (secret.charAt(i) == guess.charAt(i)) 
	            	bulls++;
	            else {
	                if (numbers[secret.charAt(i)-'0']++ < 0) 
	                	cows++;
	                if (numbers[guess.charAt(i)-'0']-- > 0) 
	                	cows++;
	            }
	        }
	        return bulls + "A" + cows + "B";
	}
	
}
