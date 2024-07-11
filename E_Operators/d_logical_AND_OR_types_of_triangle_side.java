package E_Operators;

import java.util.Scanner;

public class d_logical_AND_OR_types_of_triangle_side {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In Triangle ABC:");
        System.out.println("Enter the length of side BC(a):");
        int a = sc.nextInt();
        System.out.println("Enter the length of side AC(b):");
        int b = sc.nextInt();
        System.out.println("Enter the length of side AB(c):");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if ((a == b || b == c || a == c)) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
        sc.close();
    }
}
