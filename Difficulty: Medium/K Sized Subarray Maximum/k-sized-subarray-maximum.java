//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // taking input using class Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // taking total number of elements
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            int k = Integer.parseInt(br.readLine());
            ArrayList<Integer> res = new Solution().max_of_subarrays(arr, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function template for JAVA

class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        // Your code here
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty()&&arr[dq.getLast()]<=arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            while(!dq.isEmpty()&&(i-dq.peek()+1>k)){
                dq.pollFirst();
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        // dq.offerLast(idx);
        ans.add(arr[dq.peek()]);
        for(int i=k;i<arr.length;i++){
            while(!dq.isEmpty()&&arr[dq.getLast()]<=arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            while(!dq.isEmpty()&&(i-dq.peek()+1>k)){
                dq.pollFirst();
            }
            ans.add(arr[dq.peek()]);
        }
        return ans;
    }
}