package B_Basic_IO;
import java.util.Scanner;

public class k_age_to_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        int days= age * 365;
        System.out.println("Your age in days = "+days + " days");
        sc.close();
    }
}
