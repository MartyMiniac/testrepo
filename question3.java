public class Main
{
    public static void main(String args[])
    {
        long n=600851475143l;
        long f=0;
        int a=3;
        while(n!=1)
        {
            if(n%a==0)
            {
                f=n;
                n=n/a;
            }
            else
            {
                a=a+2;
            }
        }
        System.out.println(f);
    }
}
