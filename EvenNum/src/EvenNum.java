import java.util.Scanner;

public class EvenNum {

    public static boolean isEven(int number)
    {
        if(number % 2 == 0)
          return true;                                  // when number is even
        else
            return false;                               // when number is not even


    }

    public static void main(String[] args)
    {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        boolean str=isEven(num);
        System.out.println(str);                        //displaying output as boolean

    }

}
