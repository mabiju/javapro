package S_Final_Keyword;

class Mom {
    // overridden method
    // final void cooking() {
    void cooking() {
        System.out.println("Mom is preparing meal.");
    }
}

class Daughter extends Mom {
    @Override
    // overriding method
    void cooking() {
        System.out.println("Papa ki pari is preparing meal.");
    }
}

public class c_final_method {
    public static void main(String[] args) {
        Daughter keti = new Daughter();
        keti.cooking();
    }
}
