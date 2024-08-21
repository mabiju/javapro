package X_Exception_Handling;

import java.util.Scanner;

public class g_exception_throws_divide {
    public int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        g_exception_throws_divide obj = new g_exception_throws_divide();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend:");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor:");
        int divisor = sc.nextInt();
        sc.close();

        try {
            System.out.println("The quotient = " + obj.divide(dividend, divisor));
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a non-zero value by zero.");
        }
    }
}
