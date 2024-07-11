package D_Control_Statements.d_jump;

public class a_break_for {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}