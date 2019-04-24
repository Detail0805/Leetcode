package SimpleMaths.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
	/**
	 * 141. Linked List Cycle
	 * @param args
	 */
	public static void main(String[] args) {

		
	}
	 // Time: O(n), Space: O(n)
	public  static Boolean hasCycle(ListNode head){
		 Set<ListNode> node = new HashSet<ListNode>();
		 for(ListNode p =head;p!=null;p=p.next){
			 if(node.contains(p))return true;
			 node.add(p);
		 }
		 return false;
	}
	// Time: O(n), Space: O(1)
	  public boolean hasCycleWithTwoPointer(ListNode head) {
		    ListNode fast = head, slow = head;
		    while (fast != null && fast.next != null) {
		      fast = fast.next.next;
		      slow = slow.next;
		      if (fast == slow) return true;
		    }
		  return false;
	  }
	
	  public class ListNode {
		    int val;
		    ListNode next;

		    ListNode(int x) {
		      val = x;
		    }
	}
}
