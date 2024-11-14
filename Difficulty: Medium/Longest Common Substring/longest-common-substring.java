//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
         int count= 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j < s1.length(); j++) {
                String subStr = s1.substring(i, j + 1);
                if (s2.contains(subStr)) {
                    count = Math.max(count, subStr.length());
                }
            }
        }
        return count;
    }
}