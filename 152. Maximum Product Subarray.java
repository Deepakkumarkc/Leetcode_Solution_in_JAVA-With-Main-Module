import java.util.*;
class Main{
    public static void main(String[] args){
        int [] arr = {2,3,-2,4};
        Solution s = new Solution();
        System.out.println("Output: " + s.maxProduct(arr));
    }
}
class Solution{
    public int maxProduct(int[] nums)
    {
        int length = nums.length;
        if(length == 0) return 0;

        int min = nums[0];
        int max = nums[0];
        int result = nums[0];
        int temp_max = 0;

        for(int i = 1; i < length; i++)
        {   
            System.out.println("Max = "+max);
            temp_max = Math.max(max * nums[i], Math.max(min * nums[i], nums[i]));
            min = Math.min(max * nums[i], Math.min(min * nums[i], nums[i]));
            max = temp_max;
            System.out.println("Max = "+max);
            System.out.println("Min = "+min);
            result = Math.max(result , max);
        }
        return result;
    }
}