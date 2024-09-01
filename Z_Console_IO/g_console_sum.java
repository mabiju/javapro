package Z_Console_IO;

public class g_console_sum {
    public static void main(String[] args) {
        System.out.println("Enter the value of a :");
        String stra = System.console().readLine();
        int a = Integer.parseInt(stra);
        System.out.println("Enter the value of b :");
        String strb = System.console().readLine();
        int b = Integer.parseInt(strb);
        System.out.println("Sum = " + (a + b));
    }
}
