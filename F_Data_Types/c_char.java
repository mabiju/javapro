package F_Data_Types;

import java.util.Scanner;

public class c_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter :");
        char letter = sc.next().charAt(0);
        System.out.println("You entered :" + letter);
        System.out.println("ASCII value for the letter " + letter + " is = " + (int) letter);
        // char letter = 'a';
        // int ascii_num = letter;
        sc.close();
    }
}
