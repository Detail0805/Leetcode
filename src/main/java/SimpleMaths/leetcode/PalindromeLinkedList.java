package SimpleMaths.leetcode;

import java.util.Stack;

public class PalindromeLinkedList {
	
/**
 * leetcode 234. Palindrome Linked List
 * @param args
 */
	public static void main(String[] args) {
		ListNode bbb=new ListNode(1);
		ListNode aa=new ListNode(2);
		ListNode aa1=new ListNode(2);
		ListNode aa2=new ListNode(1);
		bbb.next=aa;
		bbb.next.next=aa1;
		bbb.next.next.next=aa2;
		isPalindrome2(bbb);
	}
	
	// Time: O(n), Space: O(n)
	 public boolean isPalindrome(ListNode head) {
		 Stack<Integer> s=new Stack<Integer>();
		 ListNode cur=null;
		 for (ListNode l = head; l != null; l = l.next)
		      s.push(l.val);
		 for(ListNode k=head;k !=null;k=k.next){
			 if(s.pop()!=k.val) return false;
		 }
	       return true; 
	}
	 
	// Time: O(n), Space: O(1) reverse
	 public static boolean isPalindrome2(ListNode head) {
		 int length=0;
		 for(ListNode l=head;l!=null;l=l.next,++length){};
		 ListNode cur=head,pre=null;
		 //pre cur
		 for(int i=0;i<length/2;i++){
			ListNode next = cur.next;//save next
			cur.next=pre;//
			pre=cur;
			cur=next;
		 }
		 if(length%2==1)cur=cur.next;
		 
		 for(;pre!=null&&cur!=null;pre=pre.next,cur=cur.next){
			 if(pre.val!=cur.val)
				 return false;
		 }
		 return true; 
	}
	 
	  public static class ListNode {
		      int val;
		     ListNode next;
		      ListNode(int x) { val = x; }
	  }
}
