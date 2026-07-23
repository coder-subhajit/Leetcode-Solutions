import java.util.*;
class Solution {
    public String defangIPaddr(String address) {
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                list.add("[.]");
            }else{
                list.add(String.valueOf(address.charAt(i)));
          }
        }
          return String.join("",list);
        } 
}