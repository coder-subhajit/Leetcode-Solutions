class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>>ans=new ArrayList<>();

      for(int row=0;row<numRows;row++){
        //take one temp list
        List<Integer>temp=new ArrayList<>();

        //first elm
        temp.add(1);
        for(int col=1;col<row;col++){
        
        //middle elm
        int val=ans.get(row-1).get(col-1)+ans.get(row-1).get(col);
        temp.add(val);
        }

        //last elm
        if(row>0){
            temp.add(1);
        }
        ans.add(temp);
      }  
      return ans;
    }
}