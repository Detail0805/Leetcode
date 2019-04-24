package SimpleMaths.leetcode;

public class strstr {
	/**
	 * 28. Implement strStr()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int strstr(String haystack, String needle){
	    if (haystack == null || needle == null) return -1;
	    if (needle.length() == 0) return 0;
		int n=haystack.length(),m=needle.length();
		for(int i=0;i<=n-m;i++){
			 int j = 0, k = i;
		      for (; j < m && k < n && needle.charAt(j) == haystack.charAt(k); ++j, ++k);
		      if (j == needle.length()) return i;
		      
//			int j=0,k=0;
//			for(;j<n&&k<m&&haystack.charAt(j)==needle.charAt(k);j++,k++);
//			if(needle.length()==k)return i;
		}
		
		return -1;
	}
}
