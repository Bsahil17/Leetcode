class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int total=n*n;
        HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int x=grid[i][j];
            map.put(x,map.getOrDefault(x,0)+1);
        }
      }
      int missing=0;
      int repeated=0;
      for(int i=1;i<=total;i++){
      if(!map.containsKey(i)){
       missing=i;
      }
      if(map.containsKey(i) && map.get(i)==2){
        repeated=i;
      }
      }
  return new int []{repeated,missing};
    }
}