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
    public ListNode reverseKGroup(ListNode head, int k) {
      if(head==null || k==1){
        return head;
      } 
      ListNode curr=head; 
      ArrayList<Integer> list=new ArrayList<>();
      while(curr!=null){
        list.add(curr.val);
        curr=curr.next;
      }
      
      for(int i=0;i+k<=list.size();i+=k){
        int left=i;
        int right=i+k-1;
        while(left<right){
          int temp=list.get(left);
          list.set(left,list.get(right));  
          list.set(right,temp);
          left++;
          right--;
        }
      }
      curr=head;
      int index=0;
      while(curr!=null){
        curr.val=list.get(index);
        index=index+1;
        curr=curr.next;
      }
      return head;
    }
}