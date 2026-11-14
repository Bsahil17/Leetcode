// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//           int num=nums[i];
//           if(map.containsKey(num)){
//             return true;
//           }
//           map.put(num,i);
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//           for(int i=0;i<nums.length;i++){
//             int num=nums[i];
//             map.put(num,map.getOrDefault(num,0)+1);
//             if(map.get(num)>1){
//                 return true;
//             }
         
//            }
//            return false;
//      }
//       }

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
    for(int num:nums){
        if(map.get(num)>1){
            return true;
        }
    }
    return false;
    }
}