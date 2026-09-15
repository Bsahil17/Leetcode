class Solution {
    public int maxFreqSum(String s) {

       HashMap<Character,Integer> map1=new HashMap<>();
       HashMap<Character,Integer> map2=new HashMap<>();
       for(char ch='a';ch<='z';ch++){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            map1.put(ch,0);
        }else{
            map2.put(ch,0);
        }
       }

       for(char ch:s.toCharArray()){
        if(map1.containsKey(ch)){
          map1.put(ch,map1.getOrDefault(ch,0)+1);  
        }else{
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
       }
      
      int maxvowelcount=0;
       int maxconsonentcount=0;
      
      for(int freq:map1.values()){
        maxvowelcount=Math.max(maxvowelcount,freq);
      }
      for(int freq:map2.values()){
        maxconsonentcount=Math.max(maxconsonentcount,freq);
      }

      return maxvowelcount+maxconsonentcount;
    } 
}