package D_Control_Statements.a_if_block;

import java.util.Scanner;

public class c_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is +ve or -ve:");
        ;
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The number " + num + " is a +ve number.");
        } else {
            System.out.println("The number " + num + " is a -ve number.");
        }
        sc.close();
    }
}
