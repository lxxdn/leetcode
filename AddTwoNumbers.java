// Problem: You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
// 思路：挨个儿查询 做法并不是很好
public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode header = new ListNode(0);
		ListNode currentNode = header;
		int extra = 0;
		while(l1 != null || l2 != null){
			currentNode = currentNode.next = new ListNode(0);
			
			int l1Value, l2Value;
			l1Value = l2Value = 0;
			if(l1 != null){
				l1Value = l1.val;
				l1 = l1.next;
			}
			if(l2 != null){
				l2Value = l2.val;
				l2 = l2.next;
			}
			int sum = l1Value + l2Value + extra;
			extra = 0;

			if(sum >= 10 ){
				extra = 1;
				sum -= 10;
			}
			currentNode.val = sum;

		}
		if(extra != 0){
			currentNode.next = new ListNode(1);
		}
		return header.next;
    }
	
	public static class ListNode{
		public int val;
		public ListNode next;
		public ListNode(int v){val = v;}
	}	
	
	public static void main(String[] args){
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(5);
		
		addTwoNumbers(l1, l2);
	}
}
