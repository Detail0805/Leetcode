package SimpleMaths.leetcode;


/**
 * 88. Merge Sorted Array
 */
class MergeSortedArray{ 
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
       
       int i = m - 1, j = n - 1, k = m + n - 1;
       while (i >= 0 && j >= 0) {
         if (nums2[j] > nums1[i])
           nums1[k--] = nums2[j--];
         else
           nums1[k--] = nums1[i--];
       }
       while (j >= 0) nums1[k--] = nums2[j--];
     }
    
	 public static void main(String[] args) {
//		   int[] nums3 = {1,2,3,0,0,0}; // m = 3
//	       int[] nums4 = {2,5,6}; //n=2
	       int[] nums3 = {0}; // m = 3
	       int[] nums4 = {1}; //n=2
	       merge(nums3,1,nums4,1);
	       System.out.println(nums3[0]);
	       System.out.println(nums3[1]);
	       System.out.println(nums3[2]);
	       System.out.println(nums3.length);
	 }

} 