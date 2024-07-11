package E_Operators;

public class i_bitwise_complement {
    public static void main(String[] args) {
        int a = 5; // 0101

        // Demo of Bitwise complement(~) Operator
        int c = ~a;
        /*
         * Exaplanation:
         * 0101
         * ----
         * 1010
         * 0011= 10 (Decimal)
         */

        System.out.println(c); // -6
    }
}
