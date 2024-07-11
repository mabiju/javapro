package F_Data_Types;

public class r_array_two_dim_accessing_single_element {
    public static void main(String[] args) {
        int[][] myArray = {
                // 2x3
                { 12, 34, 56 },
                { 56, 77, 88 }
        };
        System.out.println(myArray[1][2]);
    }
}
