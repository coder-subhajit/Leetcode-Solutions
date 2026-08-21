class Solution {
    static boolean pal(String s,int left,int right){
        //skip non-aplphaneumeric characters
        while(left<right&&!Character.isLetterOrDigit(s.charAt(left))){
        left++;
        }
         while(left<right&&!Character.isLetterOrDigit(s.charAt(right))){
        right--;
        }
        //base case
        if(left>=right){
            return true;
        }
        //character's does not match
        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
            return false;
        }
        //recursive call
        return pal(s,left+1,right-1);
    }
    public boolean isPalindrome(String s) {
     return pal(s,0,s.length()-1);   
    }
}