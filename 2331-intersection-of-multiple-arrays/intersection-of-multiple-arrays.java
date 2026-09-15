class Solution {
    public List<Integer> intersection(int[][] nums) {
       int n=nums.length;
       ArrayList<Integer> list=new ArrayList<>();
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        for(int j=0;j<nums[i].length;j++){
            int x=nums[i][j];
            map.put(x,map.getOrDefault(x,0)+1);
        }
       }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            if(freq==n){
                list.add(num);
            }
        }
        Collections.sort(list);
        return list;
    }
}