class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {    
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=left;i<=right;i++){
        int org=i;
        boolean isselfdivising=true;
        while(org>0){
            int last=org%10;
            if(last==0 || i%last!=0){
                isselfdivising=false;
                break;
            }
            org=org/10;
        }
        if(isselfdivising){
            list.add(i);
        }
    }
    return list;
    }
}