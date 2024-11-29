//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        for (int tc = 0; tc < t; tc++) {
            String[] greedStr = sc.nextLine().split(" ");
            String[] cookieStr = sc.nextLine().split(" ");

            int[] greed = Arrays.stream(greedStr).mapToInt(Integer::parseInt).toArray();
            int[] cookie =
                Arrays.stream(cookieStr).mapToInt(Integer::parseInt).toArray();

            Solution obj = new Solution();
            System.out.println(obj.maxChildren(greed, cookie));
            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends



class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        // Your code goes here.
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int i=greed.length-1;
        int j=cookie.length-1;
        int count=0;
        while(i>=0&&j>=0){
            while(i>=0&&greed[i]>cookie[j]){
                i--;
            }
            if(i<0) break;
            count++;
            i--;
            j--;
        }
        return count;
    }
}