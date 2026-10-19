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
// class Solution {
//     public ListNode partition(ListNode head, int x) {
//         if(head==null){
//             return null;
//         }
//       ArrayList<Integer> list=new ArrayList<>();
//       ListNode curr=head;
//       while(curr!=null){
//         if(curr.val<x){
//             list.add(curr.val);
       
//         }
//             curr=curr.next;
//       }
//       curr=head;
//       while(curr!=null){
//         if(curr.val>=x){
//             list.add(curr.val);
        
//         }
//             curr=curr.next;
//       }
//       curr=head;
//       int index=0;
//       while(curr!=null){
//       curr.val=list.get(index);
//       curr=curr.next;
//       index++;
//       }
//       return head;
//     }
// }

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smalldummy=new ListNode(0);
        ListNode small=smalldummy;
        ListNode largedummy=new ListNode(0);
        ListNode large=largedummy;
        ListNode curr=head;
        while(curr!=null){
        if(curr.val<x){
         small.next=curr;
         small=small.next;
        }else{
            large.next=curr;
            large=large.next;
        }
        curr=curr.next;
        }
        large.next=null;
        small.next=largedummy.next;
        return smalldummy.next;
    }
}