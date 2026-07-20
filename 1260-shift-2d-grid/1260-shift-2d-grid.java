class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows=grid.length;
        int cols=grid[0].length;
        int size=rows*cols;
        int[] temp=new int[size];
        int index=0;
        //Transfer 2d grid to 1d array index
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
             temp[index++]=grid[i][j];
            }
        }
        //shifting k times using a new array
        int[] shifted=new int[size];
        int newIndex=0;
        for(int i=0;i<size;i++){
            newIndex=(i+k)%size;
            shifted[newIndex]=temp[i];
        }
        //now create a list to store list
        List<List<Integer>>ans=new ArrayList<>();
        index=0;
        for(int i=0;i<rows;i++){
            List<Integer>row=new ArrayList<>();
            for(int j=0;j<cols;j++){
                row.add(shifted[index++]);
            }ans.add(row);
        }return ans;
    }
}