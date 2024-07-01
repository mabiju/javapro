package A_Basic_IO;
import java.util.Scanner;

public class e_area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        int l = sc.nextInt();
        System.out.print("Enter breadth:");
        int b = sc.nextInt();
        int area = l * b;
        System.out.println("The area of rectangle = " + area + " m. sqr");
        sc.close();
    }
}
