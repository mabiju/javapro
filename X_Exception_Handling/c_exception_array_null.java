package X_Exception_Handling;

public class c_exception_array_null {
    public static void main(String[] args) {
        // int num[] = null;
        try {
            // System.out.println(num[5]);
        }
        /*
         * catch (ArithmeticException e) {
         * System.out.println("Arithmetic exception handled. " + e);
         * } catch (NullPointerException e) {
         * System.out.println("Null pointer exception handled." + e);
         * }
         */
        catch (Exception e) {
            System.out.println("Exception handled." + e);
        }
    }
}
