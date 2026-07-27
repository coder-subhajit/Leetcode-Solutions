class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    //create a hashset which copy all the unique elements of nums1
    HashSet<Integer>set1=new HashSet<>();
    for(int n : nums1){
        set1.add(n);
    }
     HashSet<Integer>set2=new HashSet<>();
    //now traverse the nums2
    for(int n : nums2){
        if(set1.contains(n)){
            set2.add(n);
        }
    }
        int[] result=new int[set2.size()];
        int i=0;
        for(int n : set2){
            result[i++]=n;
        }
         return result;
    }
}