//----------------------------------------------------------------------
//  DEVELOPMENT ENVIRONMENT: IntelliJ IDEA
//  WHAT:
//      Title.............palindromeFinder.java
//      Description:
//          Determines if user input is a palindrome or not.
//
//  WHO:
//      Author............Kendall DeBenon
//  WHEN:
//      Inception.........October 18, 2020
//      Last changed......October 19, 2020
//          by............Kendall DeBenon
//
//  HOW:
//      Input:
//          User must input any amount of integers so they can be checked as a palindrome or not.
//
//      Output:
//          Informs user on the usage of palindrome or not
//
//      Notes:
//          None
//
//----------------------------------------------------------------
import java.util.Arrays;
import java.util.Scanner;


public class palindromeFinder {
    public static void main(String[] args)
    {

        int rem;
        int reverse= 0;
        int temp;
        // char[] inty = new char[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of numbers to be used: ");  // Number input by the user to determine Palindrome
        int num = input.nextInt();


        temp = num;


        while( num != 0 ) // Reverses integers to deterimine if palindrome or not
        {
            rem= num % 10;
            reverse = reverse * 10 + rem;
            num = num /10;
        }


        if (temp == reverse)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
    }
}
