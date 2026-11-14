// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x<0) return false;
//         int palindrome=0;
//         int org=x;
//         while(x>0){
//             int last=x%10;
//             palindrome=palindrome*10+last;
//             x=x/10;
//         }
//             return org==palindrome;
//     }
// }

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int palindrome=0;
        int org=x;
        while(x>0){
            int last=x%10;
            palindrome=palindrome*10+last;
            x=x/10;
        }
        return org==palindrome;
    }
}