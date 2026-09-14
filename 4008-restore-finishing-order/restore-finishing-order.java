class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=friends.length;
        int ans[]=new int[n];
        int index=0;
     HashSet<Integer> set=new HashSet<>();
     for(int frd:friends){
        set.add(frd);
     }
     
     for(int ord:order){
        if(set.contains(ord)){
          ans[index]=ord;
          index++;
        }
     }
     return ans;
    }
}