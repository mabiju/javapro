// widening type casting(explicit type conversion)
package G_Type_Casting;

public class a_int_to_double {
    public static void main(String[] args) {
        int num_int = 78;
        System.out.println("The integer number is " + num_int);
        double num_double = (double) (num_int);
        System.out.println("The double number is " + num_double);
        System.out.println(((Object)num_int).getClass().getSimpleName()); // checking numeric data types
        System.out.println(((Object)num_double).getClass().getSimpleName());
    }
}
