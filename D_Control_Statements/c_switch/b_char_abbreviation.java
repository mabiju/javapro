package D_Control_Statements.c_switch;

import java.util.Scanner;

public class b_char_abbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter from a to e to get its abbreviation:");
        char letter = sc.next().charAt(0);
        switch (Character.toLowerCase(letter)) {
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("Cat");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            case 'e':
                System.out.println("Elephant");
                break;

            default:
                System.out.println("Invalid input.");
                break;
        }
        sc.close();
    }
}
