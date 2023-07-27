//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[] a = new int[n], b = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().findSum(a, b);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    ArrayList<Integer> findSum(int a[], int b[]) {
        // code here
        int carry = 0;
        int length = Math.max(a.length,b.length);
        int ans[] = new int[length + 1];
        int p1 = a.length - 1, p2 = b.length - 1, p3 = ans.length - 1;
        while(p1 >= 0 || p2 >= 0 || carry > 0){
            int val1 = (p1 >= 0) ? a[p1] : 0;
            int val2 = (p2 >= 0) ? b[p2] : 0;
            
            if(val1 + val2 + carry > 9) {
                ans[p3] = (val1 + val2 + carry) % 10;
                carry = (val1 + val2 + carry) / 10;
            }else {
                ans[p3] = (val1 + val2 + carry);
                carry = 0;
            }
            p1--;
            p2--;
            p3--;
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < ans.length; i++){
            if(i == 0 && ans [i] == 0) continue;
            al.add(ans[i]);
        }
        
        return al;
        
    }
}