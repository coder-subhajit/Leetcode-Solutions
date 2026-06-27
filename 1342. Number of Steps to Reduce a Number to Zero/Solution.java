class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        do{ if(num==0){
            return 0;
        }
            else if(num%2==0){
                num=num/2;
            } else{
                num=num-1;
            }steps++;
            } while(num>0);
      return steps;
}}
