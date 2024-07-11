package E_Operators;

public class l_relational {
    public static void main(String[] args) {
        /*
         * 1. == (double equals to)
         * 2. != (not equals to)
         * 3. > (is greater than)
         * 4. < (is less than)
         * 5. >= (is greater than or equals to)
         * 6. <= (is less than or equals to)
         */

        int a = 3;
        int b = 5;

        /*
         * 1. == (double equals to)
         * if (a == b) {
         * System.out.println("The numbers are same.");
         * } else {
         * System.out.println("Numbers are different.");
         * }
         */

        /*
         * 2. != (not equals to)
         * if (a != b) {
         * System.out.println("The numbers are different.");
         * } else {
         * System.out.println("Numbers are same.");
         * }
         */

        /*
         * 3. > (is greater than)
         * if (a > b) {
         * System.out.println(a + " is greater than " + b);
         * } else {
         * System.out.println(b + " is greater than " + a);
         * }
         */

        /*
         * 4. < (is less than)
         * if (a < b) {
         * System.out.println(a + " is less than " + b);
         * } else {
         * System.out.println(b + " is less than " + a);
         * }
         */

        /*
         * 5. >= (is greater than or equals to)
         * if (a >= b) {
         * System.out.println(a + " is greater than or equals to " + b);
         * } else {
         * System.out.println(b + " is greater than or equals to " + a);
         * }
         */

        // 6. <= (is less than or equals to)
        if (a <= b) {
            System.out.println(a + " is less than or equals to " + b);
        } else {
            System.out.println(b + " is less than or equals to " + a);
        }

    }
}
