package D_Control_Statements.c_switch;

import java.util.Scanner;

public class c_char_operator_arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number :");
        double num2 = sc.nextDouble();
        System.out.println("Enter a symbol +,-,* or / to perform an arithmetic operation:");
        char opt = sc.next().charAt(0);
        switch (opt) {
            case '+':
                System.out.println("Sum = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Difference = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Product = " + (num1 * num2));
                break;
            case '/':
                System.out.println("Quotient = " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}
