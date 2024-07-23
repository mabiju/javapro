package K_Constructors;

import java.util.Scanner;

class Number {
    int a, b;

    Number(int x, int y) {
        a = x;
        b = y;
    }

    void sum() {
        System.out.println("The sum = " + (a + b));
    }
}

public class f_parameterized_constructor_to_add_two_user_input_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int p = sc.nextInt();
        System.out.println("Enter another number :");
        int q = sc.nextInt();

        Number n1 = new Number(p, q);
        n1.sum();
        sc.close();
    }
}
