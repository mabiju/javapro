package E_Operators;

public class f_bitwise_AND {
    public static void main(String[] args) {
        int a = 60; // 0011 1100
        int b = 13; // 0000 1101

        // Demo of Bitwise AND(&) Operator
        int c = a & b;
        /*
         * Expalnation:
         * 0011 1100
         * 0000 1101
         * -----------
         * 0000 1100 (Bitwise AND (&) where True & True = True otherwise False)
         * 0000 1100 = 12(in Decimal)
         */

        System.out.println(c); // 12
    }
}
