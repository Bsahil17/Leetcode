class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
     int n=arr1.length;
     int ans[]=new int [n];
     int index=0;
     HashMap<Integer,Integer> map1=new HashMap<>();
     for(int num:arr1){
        map1.put(num,map1.getOrDefault(num,0)+1);
     }
     for(int arr:arr2){
        if(map1.containsKey(arr)){
            int freq=map1.get(arr);
            for(int i=0;i<freq;i++){
                ans[index]=arr;
                index++;
            }
            map1.remove(arr);
        }
     }
     ArrayList<Integer> list=new ArrayList<>();
     for(int num:map1.keySet()){
        int freq=map1.get(num);
        for(int i=0;i<freq;i++){
            list.add(num);
        }
     }
     Collections.sort(list);
     for(int num:list){
        ans[index]=num;
        index++;
     }
     return ans;
    }
}