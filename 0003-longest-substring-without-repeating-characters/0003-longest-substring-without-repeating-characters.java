class Solution {
    public int lengthOfLongestSubstring(String s) {
    int left=0,maxlen=0;
    HashMap<Character,Integer>map=new HashMap<>();
    for(int right=0;right<s.length();right++){
        char ch=s.charAt(right);
        if(map.containsKey(ch)&&map.get(ch)>=left){
            left=map.get(ch)+1;
        }
            map.put(ch,right);
    maxlen=Math.max(maxlen,right-left+1);    
    }
    return maxlen;
    }
}