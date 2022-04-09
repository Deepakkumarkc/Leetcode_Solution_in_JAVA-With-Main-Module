import java.util.*;  

class Main{
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number staircase: ");  
        int a= sc.nextInt();  
        Solution s = new Solution();
        System.out.println("Output: " +s.climbStairs(a)); 

    }
}
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        if(n == 1){
         dp[1] = 1;   
        }
        if(n == 2){
         dp[2] = 2;   
        }
        if(n > 2){
        dp[1] = 1;
        dp[2] = 2;   
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }   
        }
        return dp[n];
    }
}