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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode dummy=new ListNode(0);
       dummy.next=head;
       ListNode curr=dummy;
       while(curr.next!=null && curr.next.next!=null){
        if(curr.next.val==curr.next.next.val){
            curr.next=curr.next.next;
        }else{
            curr=curr.next;
        }
       }
       return dummy.next;
    }
}


// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ArrayList<Integer> list=new ArrayList<>();
//         ListNode curr=head;
//         while(curr!=null){
//             list.add(curr.val);
//             curr=curr.next;
//         }
//         HashSet<Integer> set=new  LinkedHashSet<>();
//         for(int num:list){
//             set.add(num);
//         }
//         ListNode dummy=new ListNode(0);
//         ListNode cur=dummy;
//         for(int num:set){
//             cur.next=new ListNode(num);
//             cur=cur.next;
//         }
//         return dummy.next;
//     }
// }