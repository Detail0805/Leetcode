package SimpleMaths.leetcode;

public class LengthofLastWord {

	/**
	 * 58. Length of Last Word
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOFW("Hello World");
	}

	
	public static int LOFW(String s){
        if(s==null||s.length()==0) return 0;
        int temp=0;s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
        	if(s.charAt(i)!=' '){
        		temp++;
        	}else if(s.charAt(i)==' '){
        		return temp;
        	}
        }
        return temp;
	}
}
