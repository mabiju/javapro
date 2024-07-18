package G_Type_Casting;

public class f_string_int_calc {
    public static void main(String[] args) {
        int num_val = 123;
        String string_val = "456";
        int num_string = Integer.parseInt(string_val);
        int sum = num_val + num_string;
        System.out.println("The sum = " + sum);
    }
}
