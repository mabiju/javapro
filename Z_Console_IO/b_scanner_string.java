package Z_Console_IO;

import java.util.Scanner;

public class b_scanner_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        // String name = sc.next(); // prints without whitespace
        String name = sc.nextLine();
        System.out.println("Your name is = " + name);
        sc.close();
    }
}
