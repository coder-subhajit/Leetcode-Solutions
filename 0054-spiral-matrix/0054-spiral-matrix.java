class Solution {
    public List<Integer> spiralOrder(int[][] m) {

    List<Integer>ans=new ArrayList<>();

    //take the pointers
    int left=0,right=m[0].length-1;
    int top=0,buttom=m.length-1;

    while(top<=buttom&&left<=right){
        //left to right
        for(int col=left;col<=right;col++){
            ans.add(m[top][col]);
        }
        top++;

        //top to buttom
        for(int row=top;row<=buttom;row++){
            ans.add(m[row][right]);
        }
        right--;

        //right to left
        if(top<=buttom){
        for(int col=right;col>=left;col--){
            ans.add(m[buttom][col]);
        }
        buttom--;
        }

        //left to top
        if(left<=right){
        for(int row=buttom;row>=top;row--){
            ans.add(m[row][left]);
        }
        left++;
        }
    }
    return ans;
    }
}