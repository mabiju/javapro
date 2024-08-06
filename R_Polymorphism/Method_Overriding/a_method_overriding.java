package R_Polymorphism.Method_Overriding;

class Mom {
    // overridden method
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

public class a_method_overriding {
    public static void main(String[] args) {
        Daughter keti = new Daughter();
        keti.cooking();
    }
}
