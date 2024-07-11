package E_Operators;

import java.util.Scanner;

public class e_logical_NOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of a:");
        int b = sc.nextInt();
        sc.close();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // use of Logical NOT
        System.out.println("!(a<b) = " + !(a < b));
        System.out.println("!(a>b) = " + !(a > b));
    }
}
