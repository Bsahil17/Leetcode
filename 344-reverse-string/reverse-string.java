// class Solution {
//     public void reverseString(char[] s) {
//         int l=0;
//         int r=s.length-1;
//         while(l<r){
//             char temp=s[l];
//             s[l]=s[r];
//             s[r]=temp;
//             l++;
//             r--;
//         }
//     }
// }



class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
        int i=0;
        int j=n;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}