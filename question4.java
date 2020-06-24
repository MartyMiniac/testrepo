/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/
class Main
{ 
    public static void main (String[] args)  
    { 
        Main ob = new Main();
        int ans=0,t=0;
        int a=0, b=0;
        for(a=100; a<=999; a++)
        {
            for(b=100; b<=999; b++)
            {
                /* 
        	 * Computers are fast, so we can implement this solution directly without any clever math.
        	 * Note that the maximum product is 899 * 899, which fits in a Java int type.
        	 */
                t=a*b;
                if(ob.check(t))
                {
                    if(t>ans)
                    {
                        ans=t;
                    }
                }
            }
        }
        System.out.print(ans);
    } 
    int rev(int n, int temp) 
    { 
        // base case 
        if (n == 0) 
            return temp; 
      
        // stores the reverse 
        // of a number 
        temp = (temp * 10) + (n % 10); 
      
        return rev(n / 10, temp); 
    } 
    boolean check(int l)
    {
        if(l==rev(l,0))
        {
            return true;
        }
        return false;
    }
} 
