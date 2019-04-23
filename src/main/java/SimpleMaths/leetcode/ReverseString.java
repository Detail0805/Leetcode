package SimpleMaths.leetcode;

public class ReverseString {

	/**
	 * 344. Reverse String
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="abcde";
		System.out.println(reverseString(test));
		
	}
	
	//abcde -> edcba
	public static String reverseString(String s){
		if(s==null)return null;
		char[] reverse=s.toCharArray();
		for(int i=reverse.length-1,j=0 ; j<i ; i--,j++){
			char temp=reverse[i];
			reverse[i]=reverse[j];
			reverse[j]=temp;
		}
      return new String(reverse);
	}

}
