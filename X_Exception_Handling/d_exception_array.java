package X_Exception_Handling;

public class d_exception_array {
    public static void main(String[] args) {
        int num[] = { 12, 34, 56, 77, 89, 7, 899, 45, 23, 3, 9 };
        try {
            for (int i = 0; i <= num.length; i++) {
                System.out.println(num[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception handled." + e);
        }

    }
}
