package Z_Console_IO;

import java.io.Console;

public class d_console_int {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter a number:");
        int num = Integer.parseInt(c.readLine());
        System.out.println("The number is = " + num);
    }
}
