package B_Basic_IO;
import java.util.Scanner;

public class m_area_perimeter_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int length = sc.nextInt();
        System.out.println("Enter breadth of rectangle");
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Area of rectangle = " + area);
        System.out.println("Perimeter of rectangle = " + perimeter);
        sc.close();
    }
}
