// class Solution {
//     public int maxFrequencyElements(int[] nums) {
//      HashMap<Integer,Integer> map=new HashMap<>();
//      for(int num:nums){
//      map.put(num,map.getOrDefault(num,0)+1);
//      }
//      //max frequency

//      int maxfreq=0;
//      for(int freq:map.values()){
//         maxfreq=Math.max(maxfreq,freq);
//      }

//      //sum
//      int ans=0;
//      for(int freq:map.values()){
//         if(freq==maxfreq){
//             ans=ans+freq;
//         }
//      }
//      return ans;
//     }
// }

class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       } 
       int maxfreq=0;
       for(int freq:map.values()){
        if(freq>maxfreq){
            maxfreq=freq;
        }
       }
       int ans=0;
       for(int freq:map.values()){
        if(freq==maxfreq){
            ans+=freq;
        }
       }
       return ans;
    }
}