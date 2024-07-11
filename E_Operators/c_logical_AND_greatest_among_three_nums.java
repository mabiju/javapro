package E_Operators;

import java.util.Scanner;

public class c_logical_AND_greatest_among_three_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println("Enter the value of c :");
        int c = sc.nextInt();

        if (a > b && a > c) { // Logical AND Operator (&&)
            System.out.println(a + " is the greater than " + b + " and " + c);
        } else if (b > a && b > c) {
            System.out.println(b + " is the greater than " + a + " and " + c);
        } else {
            System.out.println(b + " is the greater than " + a + " and " + b);
        }
        sc.close();
    }
}
