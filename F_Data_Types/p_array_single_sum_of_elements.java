package F_Data_Types;

public class p_array_single_sum_of_elements {
    public static void main(String[] args) {
        int sum = 0;
        int marks[] = { 23, 45, 22, 90, 67, 89, 45, 67, 12 };
        for (int mark : marks) {
            sum += mark; // sum = sum + mark;
        }
        System.out.println("The sum of array elements = " + sum);
    }
}
