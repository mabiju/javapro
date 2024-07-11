package E_Operators;

public class h_bitwise_XOR {
    public static void main(String[] args) {
        int a = 60; // 0011 1100
        int b = 13; // 0000 1101

        // Demo of Bitwise XOR(^) Operator
        int c = a ^ b;
        /*
         * Expalnation:
         * 0011 1100
         * 0000 1101
         * -----------
         * 0011 0001 (Bitwise XOR (^) where, if corresponding bits are different, it
         * gives 1, else it shows 0.)
         * 0011 0001 = 49(in Decimal)
         */

        System.out.println(c); // 49
    }
}
