class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
      HashSet<Integer> set1=new HashSet<>();
      for(int num:nums1){
        set1.add(num);
      }  
       int countnum1=0;
      for(int num:nums2){
        if(set1.contains(num)){
            countnum1++;
        }
      }

      HashSet<Integer> set2=new HashSet<>();
      for(int num:nums2){
        set2.add(num);
      }  
       int countnum2=0;
      for(int num:nums1){
        if(set2.contains(num)){
            countnum2++;
        }
     
       }
       return new int []{countnum2,countnum1};
 }
}