package G_Type_Casting;

public class e_double_to_string {
    public static void main(String[] args) {
        double numDouble = 1234.5678d;
        System.out.println("The double value = " + numDouble);
        String numString = Double.toString(numDouble);
        System.out.println("The string value = " + numString);
    }
}
