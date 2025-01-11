//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstr(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
       HashMap<Character,Integer> set=new HashMap<>();
        int i=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<s.length();j++){
            while(i<j&&set.containsKey(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.put(s.charAt(j),j);
            max=Math.max(max,set.size());
        }
        // max=Math.max(max,set.size());
        return max;
    }
}