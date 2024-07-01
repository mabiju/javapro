package B_Basic_IO;
import java.util.Scanner;

public class i_volume_of_cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth = sc.nextInt();
        System.out.println("Enter height:");
        int height = sc.nextInt();
        int volume = length * breadth * height;
        System.out.println("The volume of cuboid = " + volume + " ut. cb");
        sc.close();
    }
}
