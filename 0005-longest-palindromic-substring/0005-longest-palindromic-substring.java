class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<2){
            return s;
        }
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            //odd
            int len1=expand(s,i,i);
            //even
            int len2=expand(s,i,i+1);

            int maxlen=Math.max(len1,len2);

            if(maxlen>end-start+1){
                start=i-(maxlen-1)/2;
                end=i+maxlen/2;
            }
        }
        return s.substring(start,end+1);
    }
    int expand(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}