class Solution {
    public int[] frequencySort(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
    }
    int n=nums.length;
    int ans[]=new int[n];
    int index=0;
    int minfreq=Integer.MAX_VALUE;
    int maxfreq=Integer.MIN_VALUE;
    for(int freq:map.values()){
      minfreq=Math.min(minfreq,freq);
      maxfreq=Math.max(maxfreq,freq);
    }
   ArrayList<Integer> list = new ArrayList<>(map.keySet());
   Collections.sort(list, Collections.reverseOrder());
   for(int f = minfreq; f <= maxfreq; f++){
    for(int num : list){
        int freq = map.get(num);
        if(freq == f){
        for(int j = 0; j < freq; j++){
                ans[index] = num;
                index++;
            }
        }
    }
}
   return ans;
    }
}