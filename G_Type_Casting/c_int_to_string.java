package G_Type_Casting;

public class c_int_to_string {
    public static void main(String[] args) {
        int num = 34;
        System.out.println("The integer value = " + num);
        String numString = String.valueOf(num);
        System.out.println("The string num value = " + numString);
        System.out.println(numString.getClass().getSimpleName()); // checking string data types
    }
}
