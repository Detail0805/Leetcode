package SimpleMaths.leetcode;

/**
 * leetcode 214. Shortest Palindrome
 * @author user
 *
 */
public class ShortestPalindrome {
	
		
	public static boolean ShortestPalindrome(String target){
		char[] StringArray=getStringtoarray(target);
		char[] ReversStringArray=getStringtoreversearray(target);
		String []same; 
		int first =StringArray.length;
		int last =StringArray.length-1;//7
		int sameword=0;
		int [] saa;
		for(int i = 0 , j = last ; i < first ; i++ , j--){
		if(StringArray[i] == ReversStringArray[j]) {
			sameword++;
			}
		}
		for(int i =0;i<first;i++)
		{
			saa=new int [first];

		}
		
		System.out.println(" samword :"+sameword);
		System.out.println(StringArray);
		System.out.println(ReversStringArray);
		
		
		return true;
	}
	
	
	
	public static char[] getStringtoarray(String s) {
			int length=s.length();
			char [] ss= new char[length];
			for(int i =0;i<s.length();i++) {
				ss[i]=s.charAt(i);
			//	System.out.println(ss[i]);
			}
			return ss;
		}

	
	public static char[] getStringtoreversearray(String target) {//123456 012345
		int length = target.length();
	//	System.out.println(length);//6
		char []sss = new char[length];
		int h=0;
		for(int i =length-1;i>=0;i--) {
			sss[h]=target.charAt(i);
			h++;
		}
		return sss;
	}
	public static String ReverseString (String originalStr){
		String resultStr = "";
		for(int i = originalStr.length() - 1 ; i >= 0 ; i--){
		resultStr = resultStr + originalStr.charAt(i);}
		return resultStr; 
		}
	
	public static String  shortestPalindrome(String s) {
	    int i=0; 
	    int j=s.length()-1;
	    while(j>=0){
	        if(s.charAt(i)==s.charAt(j)){
	            i++;
	        }
	        j--;
	    }
	 
	    if(i==s.length())
	        return s;
	 
	    String suffix = s.substring(i);
	    String prefix = new StringBuilder(suffix).reverse().toString();
	    String mid = shortestPalindrome(s.substring(0, i));
	    return prefix+mid+suffix;
	}
}
