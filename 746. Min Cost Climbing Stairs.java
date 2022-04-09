import java.util.*;  

class Main{
    public static void main(String arg[]) 
    {
        int [] arr = {1,100,1,1,1,100,1,1,100,1};
        Solution s = new Solution();
        System.out.println("Output: " +s.minCostClimbingStairs(arr)); 

    }
}
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n=cost.length;
        
        int[] ans=new int[n+1];
        ans[0]=0;
        ans[1]=0;
        for(int i=2;i<=n;i++) {
            ans[i]=Integer.min(ans[i-1]+cost[i-1],ans[i-2]+cost[i-2]);
            System.out.println((ans[i-1]+cost[i-1])+ " " +(ans[i-2]+cost[i-2])) ;
            System.out.println(ans[i]);
        }
        return ans[n];
    }
}

