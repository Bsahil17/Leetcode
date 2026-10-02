/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0;
        int lenB=0;

        ListNode curr1=headA;
        ListNode curr2=headB;

        while(curr1!=null){
            lenA++;
            curr1=curr1.next;
        }
        while(curr2!=null){
            lenB++;
            curr2=curr2.next;
        }

        curr1=headA;
        curr2=headB;

        while(lenB>lenA){
         curr2=curr2.next;
         lenB--;
        }

        while(lenA>lenB){
            curr1=curr1.next;
            lenA--;
        }

        while(curr1!=curr2){
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return curr1;
    }
}