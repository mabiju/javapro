package H_Literals;

public class a_hex_octal_binary {
    public static void main(String[] args) {
        int num_decimal = 110; // no prefix for decimal number
        int num_octal = 0110; // octal - 0(Zero)
        int num_hex = 0xA2; // hexadecimal - 0x
        int num_binary = 0b110; // binary - 0b

        System.out.println("Decimal number = " + num_decimal);
        System.out.println("Octal number = " + num_octal);
        System.out.println("Hexadecimal number = " + num_hex);
        System.out.println("Binary number = " + num_binary);
    }
}