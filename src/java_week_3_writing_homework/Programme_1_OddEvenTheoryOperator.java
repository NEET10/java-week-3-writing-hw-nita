package java_week_3_writing_homework;
import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme_1_OddEvenTheoryOperator {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = s.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        s.close();

    }
    //Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The" + number + " is " + evenOrOdd + " number ");

    }
}
