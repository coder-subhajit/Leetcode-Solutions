class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k > bloomDay.length){
            return -1;
        }
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;

        for(int day : bloomDay){
            left=Math.min(left,day);
            right=Math.max(right,day);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(canMake(bloomDay,m,k,mid)){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
            return left;
    }

    private boolean canMake(int[] bloomday,int m,int k ,int day){
        int bouquets=0;
        int flowers=0;

        for(int bloom : bloomday){
            if(bloom<=day){
                flowers++;
            
            if(flowers==k){
                bouquets++;
                flowers=0;
            }
             } 
            else{
                flowers=0;
            }
            if(bouquets>=m){
                return true;
            }
        }
                return false;
        }
    }
