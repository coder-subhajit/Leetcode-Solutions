class Solution {
    public String removeOuterParentheses(String s) {

    StringBuilder ans=new StringBuilder();

    int bal=0;

    for(char ch : s.toCharArray()){
        if(ch=='('){
            if(bal>0){
            ans.append(ch);
            }
            bal++;
        }
        else{
            bal--;
            if(bal>0){
            ans.append(ch);
        }
    }    
    }
    return ans.toString();
    }
}