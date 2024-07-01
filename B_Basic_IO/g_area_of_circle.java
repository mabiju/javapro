package B_Basic_IO;
import java.util.Scanner;

public class g_area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        float r = sc.nextFloat();
        float area = (float) (3.14 * r * r);
        System.out.println("Area of circle is:" + area);
        sc.close();
    }
}
