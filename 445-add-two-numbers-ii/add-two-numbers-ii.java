/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode prev1=null;
       ListNode curr1=l1;
       while(curr1!=null){
        ListNode next1=curr1.next;
        curr1.next=prev1;
        prev1=curr1;
        curr1=next1;
       }
      ListNode prev2=null;
       ListNode curr2=l2;
       while(curr2!=null){
        ListNode next2=curr2.next;
        curr2.next=prev2;
        prev2=curr2;
        curr2=next2;
       }
        l1 = prev1;
        l2 = prev2;
      ListNode dummy=new ListNode(0);
      ListNode curr=dummy;
      int carry=0;
      while(l1!=null ||l2!=null ||carry!=0){
        int sum=carry;
        if(l1!=null){
            sum=sum+l1.val;
            l1=l1.next;
        }
        if(l2!=null){
            sum=sum+l2.val;
            l2=l2.next;
        }
        carry=sum/10;
        curr.next=new ListNode(sum%10);
        curr=curr.next;
        }
         ListNode prev = null;
        ListNode node = dummy.next;

    while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }

        return prev;
    }
}