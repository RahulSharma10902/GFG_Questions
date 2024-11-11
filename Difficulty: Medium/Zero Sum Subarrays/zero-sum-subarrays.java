//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline

        while (t-- > 0) {
            String input = sc.nextLine(); // Input array as a space-separated string
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];

            // Parse the input array
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findSubarray(arr));
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        HashMap<Integer,Integer> hs=new HashMap<>();
        int n=arr.length;
        int ans=0;
        int sum=0;
       hs.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(!hs.containsKey(sum)){
                hs.put(sum,1);
            }else{
                ans+=hs.get(sum);
                hs.put(sum,hs.get(sum)+1);
            }
        }
        return ans;
    }
}
