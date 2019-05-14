import java.util.Scanner;

class FactorialExample{
    public static void main(String args[]){
        int i;
        int fact=1;
        long num=1;
        long facto=1;

        System.out.println("Enter num to find factorial:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if (number<13) {
            for (i = 1; i <= number; i++) {
                fact = fact * i;
            }// to calculate factorial
            System.out.println("Factorial of " + number + " is: " + fact);
        }
        else if (num>13) {
            System.out.println("Factorial of" + number + " is out of range");
            {
                for (i = 1; i <= num; i++) {
                    facto = facto * i;
                }// to calculate factorial
                System.out.println("Factorial of " + num + " is: " + facto);
            }
        }
            else
            {
                System.out.println("Factorial of"+num+" is out of range");
            }

    }
    public void longFactorial(long n){


        while(n<Long.MAX_VALUE){
            System.out.println(n);
        }
    }
}

