import java.util.*;  

class Main{
    public static void main(String arg[]) 
    {
        int [] arr = {1,100,1,1,1,100,1,1,100,1};
        Solution s = new Solution();
        System.out.println("Output: " +s.rob(arr)); 

    }
}
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int dp[]   = new int[nums.length+1]; 
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i=1; i<nums.length; i++) {
            //System.out.println("dp["+(i+1)+"] = " +dp[i+1]);
            dp[i+1] = Math.max(dp[i], dp[i-1] + nums [i]);
            //System.out.println("dp["+(i+1)+"] == dp["+(i)+"] =" +dp[i]+ " , dp["+(i-1)+"] = "+dp[i-1]+ " + nums["+i+"] = " +nums[i]);
            
        }
        return dp[nums.length];
    }
}



/*
Input: [1,2,3,1]
        0 1 2 3 3 
Output: 4

dp[0] = 0; 
dp[1] = nums[0] = 1
for i = 1
dp[2] = max(dp[1] = 1 , dp[0] = 0 + nums[1] = 2) =>     1,2 = 2
dp[3] = max(dp[2] = 2 , dp[1] = 1 + nums[2] = 3) =>     2,4 = 4
dp[4] = max(dp[3] = 4 , dp[2] = 2 + nums[3] = 1) =>     4,3 = 4

return dp[4]

*/