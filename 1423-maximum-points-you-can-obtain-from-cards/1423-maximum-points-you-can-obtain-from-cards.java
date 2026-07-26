class Solution {
    public int maxScore(int[] cardPoints, int k) {
     int leftSum=0;
     int rightSum=0;
     //first perform the sum of first leftmost k elements
     for(int i=0;i<k;i++){
     leftSum+=cardPoints[i];
     }   
    int maxSum=leftSum;
    int rightIndex=cardPoints.length-1;
    //another loops to decrease the left elements from the sie k and take the right elements as it tells the elements should contiguous
    for(int i=k-1;i>=0;i--){
        leftSum=leftSum-cardPoints[i];
        rightSum=rightSum+cardPoints[rightIndex];
        rightIndex--;
        maxSum=Math.max(maxSum,leftSum+rightSum);
    } return maxSum;
    }
}