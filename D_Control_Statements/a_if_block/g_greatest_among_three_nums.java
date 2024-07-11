package D_Control_Statements.a_if_block;

import java.util.Scanner;

public class g_greatest_among_three_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the greater then " + b + " and " + c);
        } else if (b > a && b > c) {
            System.out.println(b + " is the greater then " + a + " and " + c);
        } else {
            System.out.println(c + " is the greater then " + a + " and " + b);
        }
        sc.close();
    }
}
