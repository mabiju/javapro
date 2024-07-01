package B_Basic_IO;
import java.util.Scanner;

public class l_sum_diff_pro_div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int fnum = sc.nextInt();
        System.out.println("Enter second number :");
        int snum = sc.nextInt();
        int sum = fnum + snum;
        int diff = fnum - snum;
        int pro = fnum * snum;
        int div = fnum / snum;
        System.out.println("The sum of " + fnum + " and " + snum + " = " + sum);
        System.out.println("The difference of " + fnum + " and " + snum + " = " + diff);
        System.out.println("The product of " + fnum + " and " + snum + " = " + pro);
        System.out.println("Dividing " + fnum + " by " + snum + " quotient = " + div);
        sc.close();
    }
}
