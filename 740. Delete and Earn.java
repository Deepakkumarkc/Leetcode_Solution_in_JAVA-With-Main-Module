import java.util.*;  

class Main{
    public static void main(String arg[]) 
    {
        int [] arr = {2,2,3,3,3,4,5,6};
        Solution s = new Solution();
        System.out.println("Output: " +s.deleteAndEarn(arr)); 

    }
}   
class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // points 
        int[] points = new int[max + 1];
        for (int num : nums) {
            points[num] += num;
        }
        // House Robber 
        return rob(points);
    }

    // House Robber Code
    private int rob(int[] points) {
        long rob = 0, notRob = 0;
        for (int i = 0; i < points.length; i++) {
            System.out.println("i= "+i);
            long currRob = notRob + points[i];
            System.out.println("currRob= " +currRob+ ": notRob= "+notRob+ " + points[i]= "+points[i]);
            notRob = Math.max(notRob, rob);
            System.out.println("notRob= "+notRob);
            rob = currRob;
            System.out.println("rob= "+rob);

        }
        return (int)Math.max(rob, notRob);
    }
}