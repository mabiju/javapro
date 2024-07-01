package B_Basic_IO;
import java.util.Scanner;

public class q_number_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a = " + a);
        System.out.println("The value of b = " + b);
        sc.close();
    }
}
