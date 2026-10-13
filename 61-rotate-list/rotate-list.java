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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null ||k==0){
            return head;
        }
      ArrayList<Integer> list=new ArrayList<>();
      ListNode curr=head;
      while(curr!=null){
        list.add(curr.val);
        curr=curr.next;
      }  
      int n=list.size();
      k=k%n;

    for(int i=0;i<k;i++){
        int last=list.remove(n-1);
        list.add(0,last);
    }      
    curr=head;
    int inx=0;
    while(curr!=null){
     curr.val=list.get(inx);
     curr=curr.next;
     inx++;   
    }
    return head;
    }
}