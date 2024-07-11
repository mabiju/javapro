package D_Control_Statements.a_if_block;

import java.util.Scanner;

public class h_display_percentage_division {

    public static void main(String[] args) {
        double nep, eng, math, sci, pop, total, per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks less than 100");
        System.out.println("Enter the marks in Nepali:");
        nep = sc.nextDouble();
        System.out.println("Enter the marks in English:");
        eng = sc.nextDouble();
        System.out.println("Enter the marks in Maths:");
        math = sc.nextDouble();
        System.out.println("Enter the marks in Science:");
        sci = sc.nextDouble();
        System.out.println("Enter the marks in Population:");
        pop = sc.nextDouble();
        sc.close();

        total = nep + eng + math + sci + pop;
        System.out.println("Total marks is = " + total);

        if (nep > 31 && eng > 31 && math > 31 && sci > 31 && pop > 31) {
            per = total / 5;
            System.out.println("Percentage = " + per);

            if (per >= 80) {
                System.out.println("Distinction");
            } else if (per >= 60) {
                System.out.println("First division");
            } else if (per >= 45) {
                System.out.println("Second division");
            } else if (per >= 32) {
                System.out.println("Third division");
            } else {
                System.out.println("Something went wrong");
            }
        } else {
            System.out.println("Better luck next time.");
        }

    }
}
