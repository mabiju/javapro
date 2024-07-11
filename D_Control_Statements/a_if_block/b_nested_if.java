package D_Control_Statements.a_if_block;

import java.util.Scanner;

public class b_nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number less than 100:");
        int num  = sc.nextInt();
        if(num < 100){ 
            if(num < 50){
                System.out.println("The number " + num + " is less than 50");
            }
            if(num > 50){
                System.out.println("The number " + num + " is greater than 50");
            }
            if(num == 50){
                System.out.println("The number " + num + " is 50");
            }
        }
        sc.close();
    }
}
