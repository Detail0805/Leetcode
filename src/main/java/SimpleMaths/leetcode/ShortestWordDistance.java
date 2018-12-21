package SimpleMaths.leetcode;


/**
 * leetcode Shortest Word Distance I
 * @author user
 *
 */
public class ShortestWordDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] var1= {"practice", "makes", "perfect", "coding", "makes"};
		String word1="coding";
		String word2="practice";
		System.out.println(shortword(var1,word1,word2));
		
	}

	
	
	public static int  shortword(String[] words, String word1, String word2){
		
		//雙指針
		int idx1=-1,idx2=-1, distance=Integer.MAX_VALUE;
		
		for(int i=0;i<words.length;i++){
			if(words[i].equals(word1)){
				idx1=i;
				if(idx2>-1){
					return Math.min(distance, idx1-idx2);
				}
			}
			if(words[i].equals(word2)){
				idx2=i;
				if(idx1>-1){
					return Math.min(distance, idx2-idx1);
				}
			}
			return distance;
		}
		
		
		
		
		
		return 1;
	}
	
}
