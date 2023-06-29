//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.checkRedundancy(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int checkRedundancy(String s) {
        // code here
        Stack<Character> stk = new Stack<>();
        
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int count = 0;
            
            if(ch != ')'){
                stk.push(ch);
            }else {
                // if(stk.size() > 1){
                    while(stk.peek() != '('){
                     stk.pop();
                     count++;
                    }
                    if(count <= 1) return 1;
                    stk.pop();
                // }
            }
        }
        
     return 0;
        
    }
}
        
