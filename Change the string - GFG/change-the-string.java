//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            Solution ob = new Solution();
            String ans = ob.modify(s);
            System.out.println(ans);
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String modify(String s){
        if(s.length() == 0 || s == null) return s;
        
        char ch = s.charAt(0);
        StringBuilder sb = new StringBuilder("");
        sb.append(ch);
        for(int i = 1; i < s.length(); i++){
            char innerch = s.charAt(i);
            
            if(innerch >= 'A' && innerch <= 'Z' && ch >= 'a' && ch <= 'z'){
                innerch = (char)(innerch+ 32);
            }else if(innerch >= 'a' && innerch <= 'z' && ch >= 'A' && ch <= 'Z')
                innerch = (char)(innerch - 32);
            sb.append(innerch);
        }
        return sb.toString();
    }
}