package B_Basic_IO;

public class q_number_swap_without_user_input {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20, temp;

        System.out.println("Before Swapping");
        System.out.println("Value of num1 is :" + num1);
        System.out.println("Value of num2 is :" + num2);

        // add both the numbers and assign it to first
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping");
        System.out.println("Value of num1 is :" + num1);
        System.out.println("Value of num2 is :" + num2);
    }
}
