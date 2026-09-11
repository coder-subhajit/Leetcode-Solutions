//frequency counting 
class Solution {
    public int totalNumbers(int[] digits) {
    //take one extra array to count frequency
    int[] freq=new int[10];
    for(int digit : digits){
        freq[digit]++;
    }    
    int count=0;
    //for the first number
    for(int i=1;i<=9;i++){
        if(freq[i]==0){
            continue;
        }
            freq[i]--;
    //for the second number
    for(int j=0;j<=9;j++){
        if(freq[j]==0){
            continue;}
            freq[j]--;
    //for the third number
    for(int k=0;k<=8;k+=2){
        if(freq[k]>0){
            count++;
        }
    }   
    freq[j]++; 
    }  
    freq[i]++;  
    }
    return count;
    }
}