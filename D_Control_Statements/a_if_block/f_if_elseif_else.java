package D_Control_Statements.a_if_block;

import java.util.Scanner;

public class f_if_elseif_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number to check +ve, -ve or zero :");
        System.out.print("Enter a number to check +ve, -ve or zero :");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number " + num + " is a +ve number.");
        } else if (num < 0) {
            System.out.println("The number " + num + " is a -ve number.");
        } else {
            System.out.println("The number is Zero.");
        }
        sc.close();
    }
}
