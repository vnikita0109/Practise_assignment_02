import java.util.Scanner;

public class Chkpalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some input: ");
        String x = sc.nextLine();
        String y = "";


        palindrome(x, y);                                       //to display the output
    }

    public static void palindrome(String x, String y) {
        chkrev(x, y);

        if (x.equals(y)) {                                      //comparing input with intermediate
            System.out.println("Given input is palindrome");
        } else {
            System.out.println("Given input is not palindrome");
        }


    }

    public static String chkrev(String x, String y) {
        for (int i = x.length() - 1; i >= 0; i--) {
            y = x.charAt(i) + y;                                  //to reverse the input

        }
        return y;                                                //returning reversed intermediate
    }

}
