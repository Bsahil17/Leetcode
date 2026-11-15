// class Solution {
//     public boolean isAnagram(String s, String t) {
//         HashMap<Character,Integer> smap=new HashMap<>();
//         HashMap<Character,Integer> tmap=new HashMap<>();
//         if(s.length()!=t.length()){
//             return false;
//         }
//         for(int i=0;i<s.length();i++){
//             char c1=s.charAt(i);
//             char c2=t.charAt(i);
//             smap.put(c1,smap.getOrDefault(c1,0)+1);
//             tmap.put(c2,tmap.getOrDefault(c2,0)+1);
//         }
//         return smap.equals(tmap);
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
            
        }
        return map1.equals(map2);
    }
}