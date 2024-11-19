//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        HashSet<Character> set=new HashSet<>();
        String ans="";
        set.add(str.charAt(0));
        ans=ans+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                ans=ans+str.charAt(i);
                set.add(str.charAt(i));
            }
        }
        return ans;
    }
}

