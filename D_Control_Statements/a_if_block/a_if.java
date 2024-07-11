package D_Control_Statements.a_if_block;

import java.util.Scanner;

public class a_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number " + num + " is an positive integer.");
        }
        sc.close();
    }
}
