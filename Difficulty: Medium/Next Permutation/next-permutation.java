//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int min=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                   idx=i-1;
                   break;
            }
        }
        if(idx==-1){
            Arrays.sort(arr);
            return;
        }
        int idx2=idx+1;
        for(int i=idx2;i<arr.length;i++){
            if(arr[i]>arr[idx]&&arr[i]<=arr[idx2]&& arr[i]!=0){
                idx2=i;
            }
        }
        int temp=arr[idx];
        arr[idx]=arr[idx2];
        arr[idx2]=temp;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=idx+1;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        int j=0;
        for(int i=idx+1;i<arr.length;i++){
            arr[i]=list.get(j);
            j++;
        }
    }
}

//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends