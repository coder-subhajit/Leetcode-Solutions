class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>>ans=new ArrayList<>();

      for(int i=1;i<=numRows;i++){
        ans.add(genRow(i));
      }
      return ans;
    }
     public List<Integer>genRow(int row){
        List<Integer>list=new ArrayList<>();

        int n=1;
        list.add(1);
        for(int i=1;i<row;i++){
            n=n*(row-i)/i;
            list.add(n);
        } 
     return list;
    }
}