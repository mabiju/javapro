// write a program in java to read the user input password using console class
package Z_Console_IO;

import java.io.Console;

public class i_console_password {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter a password:");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);
        System.out.println("The password =" + pass);
    }
}
