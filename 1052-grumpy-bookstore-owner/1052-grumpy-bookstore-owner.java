class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      int n=customers.length;
      //mark the customers who r already satisfied by the service
      int satisfied=0;
      for(int i=0;i<n;i++){
        if(grumpy[i]==0){
            satisfied+=customers[i];
        }
      }
        //now check for the grumpy customers
        int extra=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
              extra+=customers[i];
            }
        }
        //sliding window
        int maxExtra=extra;
        for(int i=minutes;i<n;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
            if(grumpy[i-minutes]==1){
                extra-=customers[i-minutes];
            }
            maxExtra=Math.max(maxExtra,extra);
        }    
        return satisfied+maxExtra;
      }
    }
