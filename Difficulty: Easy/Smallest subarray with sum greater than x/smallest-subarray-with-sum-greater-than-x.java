//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        while (T > 0) {
            int x = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split(" ");
            int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

            Solution solution = new Solution();
            System.out.println(solution.smallestSubWithSum(x, arr));

            T--;
        
System.out.println("~");
}
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int min=Integer.MAX_VALUE;
        int sum=0;
        int idx=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>x){
                min=Math.min(min,i-idx+1);
                sum-=arr[idx];
                idx++;
            }
        }
        if(sum>x) min=Math.min(min,arr.length-1-idx+1);
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}
