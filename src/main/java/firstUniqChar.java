
public class firstUniqChar {

	public static void main(String[] args) {

		firstUniqChar("leetcode");
	
		
	}
	// Time: O(n), Space: O(m)
	public static int firstUniqChar(String s){
        int position=-1;
        int[] a=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;    
            
        }
        
        for(int i=0;i<s.length();i++){
            int b=a[s.charAt(i)-'a'];
            if(b==1){
                return i;
            }
        }
        return position;
	}

}
