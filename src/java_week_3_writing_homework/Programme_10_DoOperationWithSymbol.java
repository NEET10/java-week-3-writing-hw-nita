package java_week_3_writing_homework;

import java.util.Scanner;

/**
 * 10. Write a java program to input any two number and ask user to enter their symbol(+, -, *, / )
 * find addition, subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme_10_DoOperationWithSymbol {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x =s.nextInt();
        System.out.println("Please enter the second number : ");
        int y = s.nextInt();
        System.out.println("Please select the calculation symbol +, -, *, / ; ");
        char symbol = s.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);
        }
       //Calculating operation based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol){
        if (symbol == '+'){
            System.out.println(x + " + "+y+" = "+ (x + y));
        } else if (symbol == '-') {
            System.out.println(x+ " - "+y+" = "+ (x-y));
        } else if (symbol == '*') {
            System.out.println(x+ " x "+y+ " = "+(x * y));
        } else if (symbol == '/') {
            System.out.println(x+ " / "+y+" = "+(x /y));
        }else{
            System.out.println("Please enter correct symbol +, -, *, /");
        }
    }
}
