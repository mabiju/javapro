package F_Data_Types;

import java.util.Scanner;

public class l_double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double value for a:");
        double a = sc.nextDouble();
        System.out.println("Enter a double value for b:");
        double b = sc.nextDouble();
        sc.close();

        System.out.println("Sum =" + (a + b));
        System.out.println("Difference =" + (a - b));
        System.out.println("Product =" + (a * b));
        System.out.println("Quotient =" + (a / b));
    }
}
