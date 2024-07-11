package D_Control_Statements.d_jump;

public class b_break_while {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
            if (num == 7) {
                break;
            }
            System.out.println("Within loop :" + num);
            ++num;
        }
        System.out.println("Out of loop");
    }
}
