//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> arr, String word1, String word2) {
        // code here
        if(word1.equals(word2)) return 0;
        int idx1=-1;
        int idx2=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).equals(word1)){
                if(idx2!=-1){
                    min=Math.min(i-idx2,min);
                }
                idx1=i;
            }else if(arr.get(i).equals(word2)){
               
                if(idx1!=-1){
                    min=Math.min(i-idx1,min);
                }
                 idx2=i;
             }
            //  System.out.println(idx1+" "+idx2);
        } 
        if(idx1==-1||idx2==-1) return Integer.MAX_VALUE;
        return min;
    }
   
};