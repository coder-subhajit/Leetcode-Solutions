import java.util.*;
class Solution {
    public int[] shuffle(int[] nums, int n) {
    ArrayList<Integer>list=new ArrayList<>();
    for(int i=0;i<n;i++){
        list.add(nums[i]);//xi
        list.add(nums[i+n]);//yi
    }
        int[] ans=new int[2*n];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
  }return ans;
}
}