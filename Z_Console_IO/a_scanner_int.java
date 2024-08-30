package Z_Console_IO;

import java.util.Scanner;

public class a_scanner_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll number:");
        int roll = sc.nextInt();
        System.out.println("Your roll number is = " + roll);
        sc.close();
    }
}
