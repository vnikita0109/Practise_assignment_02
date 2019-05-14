import java.util.Scanner;

class Fact{

        static int factorial(int n){
            if (n == 0)
                return 1;
            else
                return(n * factorial(n-1));                                    // to calculate the factorial
        }
        public static void main(String args[]){
            int i,fact=1;
            long facto=1;
            Scanner sc=new Scanner(System.in);

            int number;
            number=sc.nextInt();

            fact = factorial(number);
            if(fact<Int.MAX_VALUE)
                System.out.println("Factorial of "+number+" is: "+fact);        //when factorial is integer
            else
                longFactorial(facto);                                           // when factorial is long
        }

        public void longFactorial(long n){

        while((n<Long.MAX_VALUE)&&(n>Int.MAX_VALUE)){
            System.out.println("Factorial of"+number+"is:"+n);      // for checking range of factorial
        }
    }
}

