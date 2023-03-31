package java_week_3_writing_homework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class programme_2_LeapYear {
    public static void main(String [] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = s.nextInt();
        programme_2_LeapYear obj = new programme_2_LeapYear();
        obj.isItLeapYearOrNot(year);
        //closing the scanner object
        s.close();
    }
    //Checking is it leap year or not
    public void isItLeapYearOrNot(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The year "+ year + " is leap year ");
            return;
        }
        System.out.println("this year "+ year+" is not a leap year ");
    }
}
