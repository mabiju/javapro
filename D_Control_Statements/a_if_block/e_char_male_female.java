package D_Control_Statements.a_if_block;

import java.util.Scanner;

public class e_char_male_female {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m for male and other letter for other genders: ");
        char g = sc.next().charAt(0);

        if (g == 'm') {
            System.out.println("Hello mister");
        } else {
            System.out.println("Hello Others");
        }
        sc.close();
    }
}
