// narrowing type casting(explicit type conversion)
package G_Type_Casting;

public class b_double_to_int {
    public static void main(String[] args) {
        double num_double = 78.23;
        System.out.println("The double number is " + num_double);
        int num_int = (int) (num_double);
        System.out.println("The integer number is " + num_int);
    }
}
