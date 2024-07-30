package P_Variable_Length_Arguments;

public class b_variable_length_argument {
    public int SumNum(int... args) {
        System.out.println("\nNumber of arguments " + args.length);
        int sum = 0;
        for (int i : args) {
            sum += i; // sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        b_variable_length_argument obj = new b_variable_length_argument();
        int sum1 = obj.SumNum(12, 34);
        System.out.println("The sum of two numbers = " + sum1);
        int sum2 = obj.SumNum(12, 34, 456);
        System.out.println("The sum of three numbers = " + sum2);
        int sum3 = obj.SumNum(12, 34, 456, 78);
        System.out.println("The sum of four numbers = " + sum3);
        int sum4 = obj.SumNum(12, 34, 456, 34, 56);
        System.out.println("The sum of five numbers = " + sum4);
    }
}
