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
//     public ListNode deleteDuplicates(ListNode head) {
//        ArrayList<Integer> list=new ArrayList<>();
//        ListNode curr=head;
//        while(curr!=null){
//         list.add(curr.val);
//         curr=curr.next;
//        }
//        HashMap<Integer,Integer> map=new HashMap<>();
//       for(int num:list){  
//         map.put(num,map.getOrDefault(num,0)+1);
//       }
//       ArrayList<Integer> res=new ArrayList<>();
//       for(int num:list){
//         if(map.get(num)==1){
//             res.add(num);
//         }
//       }
//       ListNode dummy=new ListNode(0);
//       ListNode cur=dummy;
//       for(int num:res){
//         cur.next=new ListNode(num);
//         cur=cur.next;
//       } 
//      return dummy.next;


//     }
// }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      ListNode dummy=new ListNode(0);
      dummy.next=head;
      ListNode prev=dummy;
      ListNode curr=head;
      while(curr!=null){
        if(curr.next!=null && curr.val==curr.next.val){
            int duplicate=curr.val;
            while(curr!=null && curr.val==duplicate){
               curr=curr.next; 
            }
            prev.next=curr;
        }else{
            prev=curr;
            curr=curr.next;
        }
      }
     return  dummy.next;
    }
}

