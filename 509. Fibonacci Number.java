import java.util.*;  

class Main{
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Factor Number: ");  
        int a= sc.nextInt();  
        Solution s = new Solution();
        System.out.println("Output: " +s.fib(a)); 

    }
}
class Solution {
    int[] arr = new int[31];
    public int fib(int n) {
        if(n<=1) return n;
        
        if(arr[n]>0)
        {   
            System.out.println("n= "+n+" arr= "+arr[n]);
            return arr[n];
        }
        System.out.println("n-1 = "+n+ "; n-2 = "+(n-2));
        arr[n] = fib(n-1) + fib(n-2);
        System.out.println(arr[n]+" " +fib(n-1)+ " " +fib(n-2));
        
        return arr[n];
    }
}