import java.io.*;
class F4
{
    static int isPowerOfFour(int n)
    {
        int count = 0;

        int x = n & (n - 1);

        if ( n > 0 && x == 0)
        {
            while(n > 1)
            {
                n >>= 1;
                count += 1;
            }

            return (count % 2 == 0) ? 1 : 0;
        }

        return 0;
    }

    // main function
    public static void main(String[] args)
    {
        int test_no = 64;

        if(isPowerOfFour(test_no)>0)
            System.out.println(test_no +
                    " is a power of 4");
        else
            System.out.println(test_no +
                    " is not a power of 4");
    }
}
