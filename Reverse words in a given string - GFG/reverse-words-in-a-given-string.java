//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here
        StringBuilder sb = new StringBuilder("");
        
        int i = s.length() - 1;
        
        
        while(i >= 0){
            int j = i - 1;
            while(j >= 0 && s.charAt(j) != '.') j--;
            
            for(int k = j + 1; k <= i; k++){
                sb.append(s.charAt(k));
            }
            
            i = j - 1;
            if(i >= 0) sb.append('.');
         }
         
         return sb.toString();
    }
}