package I_Variables_Constants;

class College {
    final int colz_id = 45;

    void display() {
        System.out.println("The college id = " + colz_id);
    }
}

public class b_constant_final {
    public static void main(String[] args) {
        College stc = new College();
        stc.display();
    }
}
