import java.util.* ;
import java.io.*; 
public class Solution {
    public static String editSentence(String str){

        if(str.isEmpty()){
            return "";
        }

    
          StringBuilder str2 = new StringBuilder();

             str2.append(str.charAt(0));
           for(int i=1;i<str.length();i++){
               char ch = str.charAt(i);
               if(Character.isUpperCase(ch)){
                   str2.append(" ");
               }
                str2.append(ch);
           }
           
               // Convert StringBuilder content to lowercase string
            String lowerCaseString = str2.toString().toLowerCase();

           return lowerCaseString;
    }
}