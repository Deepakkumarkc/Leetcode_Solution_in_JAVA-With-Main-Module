import java.util.*;  

class Main{
    public static void main(String arg[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N-th Tribonacci Number: ");  
        int a= sc.nextInt();  
        Solution s = new Solution();
        System.out.println("Output: " +s.tribonacci(a)); 

    }
}
class Solution {
    public int tribonacci(int n) {

        int index = 3, a =0, b=1, c=1, total;
        if(n == 0) return 0;
        else if(n <=2) return 1;
        else
        {          
            while(index <= n)
            {
            total = a + b + c;
            a = b;
            b = c;
            c = total;
            index++;
            }
        }
        return c;
    }
}