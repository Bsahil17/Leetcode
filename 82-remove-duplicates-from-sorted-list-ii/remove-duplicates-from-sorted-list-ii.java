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
       ArrayList<Integer> list=new ArrayList<>();
       ListNode curr=head;
       while(curr!=null){
        list.add(curr.val);
        curr=curr.next;
       }
       HashMap<Integer,Integer> map=new HashMap<>();
      for(int num:list){  
        map.put(num,map.getOrDefault(num,0)+1);
      }
      ArrayList<Integer> res=new ArrayList<>();
      for(int num:list){
        if(map.get(num)==1){
            res.add(num);
        }
      }
      ListNode dummy=new ListNode(0);
      ListNode cur=dummy;
      for(int num:res){
        cur.next=new ListNode(num);
        cur=cur.next;
      } 
     return dummy.next;


    }
}