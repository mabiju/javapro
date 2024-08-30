/* this program explain about the use of next() and nextLine() whilst
taking multiple string consecutively, and "sc.nextLine()" as its solution. */
package Z_Console_IO;

import java.util.Scanner;

public class c_scanner_student_info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter roll number:");
        int roll = sc.nextInt();

        System.out.println("Enter name:");
        sc.nextLine();
        // String name = sc.next();
        String name = sc.nextLine();

        System.out.println("Enter address:");
        // String address = sc.next();
        String address = sc.nextLine();

        System.out.println("Roll number = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Address= " + address);

        sc.close();
    }
}
