package SimpleMaths.leetcode;


/**
 * leetcode 27. Remove Element
 * @author user
 *
 */
public class RemoveElement {

	
	static int removeElement(int[] nums, int val) {
		
		int index=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				nums[index++]=nums[i];
			}
			
		}
		
		return index;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
