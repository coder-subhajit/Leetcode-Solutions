class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character>set=new HashSet<>();
        int left=0;
        int right=0;
        int maxLen=0;
        while(right<n){
            char ch=s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                maxLen=Math.max(maxLen,right-left+1);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
            } 
        }
        return maxLen;
    }
    }