// class Solution {
//       public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int need=target-nums[i];
//             if(map.containsKey(need)){
//              return new int []{map.get(need),i};
//             }
//             map.put(nums[i],i);
//         }
//         return new int []{-1,-1};
//       }
// }


// class Solution {
//       public int[] twoSum(int[] nums, int target) {
//       int l=0;
//       int r=nums.length-1;
//       while(l<r){
//         int sum=nums[l]+nums[r];
//         if(sum==target){
//             return new int []{l,r};
//         }else if(sum>target){
//             r--;
//         }else{
//             l++;
//         }
//       }
//       return new int[]{-1,-1};
//       }
// }

class Solution {
      public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(map.containsKey(needed)){
            return new int []{map.get(needed),i};
            }
            map.put(nums[i],i);
        }
        return new int []{-1,-1};
      }
}