import java.io.*;
class F4
{
    static int isPowerOfFour(int n)
    {
        if(n == 0)
            return 0;                               // if number is zero
        while(n != 1)
        {
            if(n % 4 != 0)
                return 0;
            n = n / 4;
        }
        return 1;                                   //if number is other than zero
    }

    // main function
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int test_no;
        test_no=sc.nextInt();

        if(isPowerOfFour(test_no)>0)
            System.out.println(test_no +
                    " is a power of 4");            // when number is power of 4
        else
            System.out.println(test_no +
                    " is not a power of 4");         //when number is not power of 4
    }
}
