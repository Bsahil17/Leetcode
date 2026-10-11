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
//     public int pairSum(ListNode head) {
//      ArrayList<Integer> list=new ArrayList<>();
//      while(head!=null){
//         list.add(head.val);
//         head=head.next;
//      }
//      int i=0;
//      int j=list.size()-1;
//      int maxsum=0;
//      while(i<j){
//       int sum=list.get(i)+list.get(j);
//       if(sum>maxsum){
//         maxsum=sum;
//       }
//       i++;
//       j--;
//      }
//      return maxsum; 
//     }
// }


class Solution {
    public int pairSum(ListNode head) {
      ListNode slow=head;
        ListNode fast=head;
        //middle
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse from middle to last
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        int ans=0;
        while(prev!=null){
            ans=Math.max(ans,head.val+prev.val);
            head=head.next;
            prev=prev.next;
        }
        return ans;
    }
}