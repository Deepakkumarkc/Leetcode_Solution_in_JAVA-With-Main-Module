class Main{
    public static void main(String[] args){
        int [] arr = {2,3,0,1,4,2,3,1,1,4};
        Solution s = new Solution();
        System.out.println("Output: " + s.maxSubarraySumCircular(arr));
    }
}
class Solution {
    public int maxSubarraySumCircular(int[] nums) {

    int sum,maxsum,maximum,minsum,minimum;
    sum = maxsum = maximum = minsum = minimum = nums[0];
        
        if(nums.length == 0) return 0;
        
        for(int i = 1; i< nums.length; i++)
        {
            int n = nums[i];
           // System.out.println("n= "+n);
            sum = sum + n;
           // System.out.println("Sum= "+sum);
            
            maxsum = Math.max(n, maxsum+n);
           // System.out.println("maxsum= "+maxsum);
            maximum = Math.max(maximum, maxsum);
           // System.out.println("maximum= "+maximum);
            
            minsum = Math.min(n, minsum+n);
           // System.out.println("minsum= "+minsum);
            minimum = Math.min(minimum, minsum);
           // System.out.println("minimum= "+minimum);
        }
        if(sum == minimum) return maximum;
        
        return Math.max(sum-minimum, maximum); //sum-minimu ::Ex: inp: 5,-3,5 - total sum = 7 minimu = -3 - sum+min = 10;
    }
}