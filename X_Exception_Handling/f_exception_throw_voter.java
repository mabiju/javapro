package X_Exception_Handling;

import java.util.Scanner;

public class f_exception_throw_voter {
    public void checkVoterAge(int age) {
        if (age < 18) {
            // System.out.println("You're not eligible to cast your vote by age.");
            throw new ArithmeticException("You're not eligible to cast your vote by age.");
        } else {
            System.out.println("You're eligible to cast your vote by age.");
        }
    }

    public static void main(String[] args) {
        f_exception_throw_voter v1 = new f_exception_throw_voter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.close();
        v1.checkVoterAge(age);
    }
}
