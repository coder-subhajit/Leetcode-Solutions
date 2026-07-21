class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted=nums.clone();
        Arrays.sort(sorted);
        //using hashmap key(holds number),value(holds first index where the no is present in the sorted array)
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<sorted.length;i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i],i);
            }
        }
            int[] ans=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                ans[i]=map.get(nums[i]);
            }
    return ans;
        }
}