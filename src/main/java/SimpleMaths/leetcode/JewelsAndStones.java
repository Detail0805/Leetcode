package SimpleMaths.leetcode;

public class JewelsAndStones {
	
	/**
	 * 771. Jewels and Stones
	 * @param args
	 */
	public static void main(String[] args) {
		int s=JS("aBc","aabbB");
		
	}
	
	/**
	 * // Time: O(m+n), Space: O(k)
	 * @param J
	 * @param S
	 * @return
	 */
	public static int  JS(String J, String S){
	    if (J == null || S == null || J.length() == 0 || S.length() == 0)
	        return 0;
	      boolean[] d = new boolean[256];
	      int cnt = 0;
	      for (int i = 0; i < J.length(); ++i)
	        d[J.charAt(i)] = true;
	      for (int i = 0; i < S.length(); ++i)
	        if (d[S.charAt(i)]) ++cnt;
	      return cnt;
		
	}

}
