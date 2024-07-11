package D_Control_Statements.a_if_block;

import java.util.Scanner;

public class d_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd:");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number " + num + " is an even number");
        } else {
            System.out.println("The number " + num + " is an odd number");
        }
        sc.close();
    }
}
