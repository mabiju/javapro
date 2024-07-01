package A_Basic_IO;
import java.util.Scanner;
import java.lang.Math;

public class j_volume_of_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = sc.nextInt();
        int volume = (int) Math.pow(length, 3);
        System.out.println("The volume = " + volume + " ut. cb");
        sc.close();
    }
}
