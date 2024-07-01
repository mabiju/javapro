package A_Basic_IO;
import java.util.Scanner;

public class p_area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of triangle:");
        float base = sc.nextFloat();
        System.out.println("Enter height of triangle:");
        float height = sc.nextFloat();
        float area = (float) (0.5 * base * height);
        System.out.println("The area of cirle = " + area);
        sc.close();
    }
}
