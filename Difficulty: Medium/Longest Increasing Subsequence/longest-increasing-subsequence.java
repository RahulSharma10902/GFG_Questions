//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine())
                               .trim()
                               .split(" "); // Read the input for the current test case
            int arr[] = new int[str.length];
            // Convert input string into an integer array
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            // Call the solution method and print the result
            System.out.println(new Solution().longestSubsequence(arr));
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to find length of longest increasing subsequence.
    static int longestSubsequence(int a[]) {
        // code here
        int n=a.length;
        ArrayList<Integer> temp = new ArrayList<>();
        int ans=1;
        temp.add(a[0]);
        for(int i=1;i<n;i++){
            if(a[i]>temp.get(temp.size()-1)){
                temp.add(a[i]);
                ans++;
            }
            else{
                int index = Collections.binarySearch(temp,a[i]);
                if(index<0){
                    index=-index-1;
                }
                temp.set(index,a[i]);
            }
        }
        return ans;}
}