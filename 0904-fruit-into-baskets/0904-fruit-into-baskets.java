class Solution {
    public int totalFruit(int[] fruits) {
    int left=0,right=0,maxlen=0,n=fruits.length;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(right=0;right<n;right++){
        //add
        map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
        //check
        while(map.size()>2){
            map.put(fruits[left],map.get(fruits[left])-1);
        //decrease freq
        if(map.get(fruits[left])==0){
            map.remove(fruits[left]);
        }
            left++;
    }
    maxlen=Math.max(maxlen,right-left+1); 
    }   
    return maxlen;
    }
}