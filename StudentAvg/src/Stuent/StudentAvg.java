package Stuent;

import java.util.Arrays;
import java.util.Scanner;

public class StudentAvg{
    public static int[] stud;
    static int number;
    public static void main(String[] args) {
        grade();
        average();
        minimum();
        maximum();

    }
    static void grade()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students:");
        number=sc.nextInt();
        stud=new int[number];
        int i=0;
        while(i!=number) {
            System.out.print("Enter the grade for student "+(i+1)+":");

            int temp=sc.nextInt();
            if( (temp >= 0) && (temp<=100)) {                           //applying boundaries to input of grades
                stud[i]=temp;
            }
            else {
                System.out.println("Enter valid value between 0-100");
                break;
            }
            i++;                                                         // incrementing to next student
        }
    }
    static String average()
    {
        float sum=0;
        for(int i=0;i<stud.length;i++)
        {

            sum=sum+stud[i];
        }
        System.out.println("The average is:"+sum/number);                //print the average of grades
        return "";
    }
    static String minimum()
    {
        Arrays.sort(stud);                                                 //to find minimum grades
        System.out.println("The minimum is:"+stud[0]);
        return "";
    }
    static String maximum()
    {
        Arrays.sort(stud);                                                  // to find maximum grades
        System.out.println("The maximum is:"+stud[stud.length-1]);
        return "";
    }
}