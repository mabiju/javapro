package V_Access_Specifier;

class College {
    public int clz_id = 78;
}

public class d_access_specifier_public {
    public static void main(String[] args) {
        College c1 = new College();
        System.out.println("College ID = " + c1.clz_id);
    }
}
