//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        // code here
        StringBuilder str=new StringBuilder();
        Arrays.sort(arr,(x,y)->(x+y).compareTo(y+x)); 
        
        for(int i=arr.length-1;i>=0;i--){
            str.append(arr[i]);
        }
        return str.toString();
    }
}