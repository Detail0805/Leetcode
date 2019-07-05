package SimpleMaths.leetcode;

import java.util.HashSet;
import java.util.Set;

public class numUniqueEmails {

	/**
	 * 929. Unique Email Addresses
	 */
	public static void main(String[] args) {
//		String[] email= new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
		String[] email= new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
		numUniqueEmails(email);
		numUniqueEmails2(email);
	}

	/**
	 * ["test.email+alex@leetcode.com",
	 * "test.e.mail+bob.cathy@leetcode.com",
	 * "testemail+david@lee.tcode.com"]
	 */
	
	 public static int numUniqueEmails(String[] emails) {
	     Set<String> email =new HashSet<String>();
	     int length =emails.length;
	     
	     for(int i =0 ; i<length;i++) {
	    	 String[] mail=emails[i].split("@");
	    	 String font=mail[0];
	    	 String domain=mail[1];
	    	 int peek=font.indexOf("+");
	    	 
	    	 if(peek!=-1) {
	    		 email.add(new StringBuilder(font.substring(0, peek).replace(".", "")).append("@"+domain).toString());
	    	 }else {
	    		 email.add(new StringBuilder(font.replace(".", "")).append("@"+domain).toString());
	    	 }
	     }
		 return email.size();
	 }
	 
	 
	 
	 /**
	  * leetcode 最快解法
	  */
	   public static int numUniqueEmails2(String[] emails){
	        //have base case check when = 0
	        Set<String> uniqueEmails = new HashSet<String>();
	        for(String email : emails){
	            uniqueEmails.add(stringIterate(email));
	        }
	        return uniqueEmails.size();
	    }
	    public static String stringIterate(String email){
	        char[] cArr = email.toCharArray();
	        boolean ign = false;
	        int ptr = 0;
	        int i = 0;
	        for(; i < cArr.length && cArr[i] != '@'; i++){
	            if(cArr[i] == '+'){
	                ign = true;
	            }
	            if(!ign && cArr[i] != '.'){
	                cArr[ptr] = cArr[i];
	                ptr++;
	            }
	        }
	        for(; i < cArr.length; i++){
	            cArr[ptr] = cArr[i];
	            ptr++;
	        }
	        return new String(cArr,0, ptr);
	    }
}
