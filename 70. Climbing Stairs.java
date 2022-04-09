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
      int [] stairs = new int [n + 1];
      stairs[0] = 1;
      stairs[1] = 1;
      for(int i = 2; i<= n; i++)
      {
          stairs[i] = stairs[i-1] + stairs[i-2];
          System.out.println(stairs[i]);  

      }
        
    return stairs[n];
      
    }
}