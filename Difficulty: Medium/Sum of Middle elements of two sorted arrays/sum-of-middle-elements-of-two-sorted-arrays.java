//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        
        while(arr1[arr1.length-1]>arr2[0]){
            if(arr2[0]<arr1[arr1.length-1]){
                int temp=arr1[arr1.length-1];
                int temp2=arr2[0];
                int k=arr1.length-2;
                while(k>=0&&arr1[k]>=temp2){
                    arr1[k+1]=arr1[k];
                    k--;
                }
                arr1[k+1]=temp2;
                k=1;
                while(k<arr2.length&&arr2[k]<=temp){
                    arr2[k-1]=arr2[k];
                    k++;
                }
                arr2[k-1]=temp;
            }
        }
        // for(int i=0;i<arr1.length;i++){
        //     System.out.print(arr1[i]+" ");
        // }
        // for(int i=0;i<arr1.length;i++){
        //     System.out.print(arr2[i]+" ");
        // }
        return arr1[arr1.length-1]+arr2[0];
        
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.SumofMiddleElements(arr, brr);
            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends