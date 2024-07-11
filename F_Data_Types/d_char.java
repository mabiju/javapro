package F_Data_Types;

import java.util.Scanner;

public class d_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value from 0 to 255 to get a character:");
        int num = sc.nextInt();
        char letter = (char) num;
        System.out.println("The converted letter is = " + letter);
        sc.close();
    }
}
