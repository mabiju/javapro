package N_Static_Fields_Methods;

public class d_static_methods {
    // static variables
    static int clzId = 27;
    static String clzName = "Sanothimi";

    // static method
    static void staticMethod() {
        System.out.println("\nCollege ID = " + clzId);
        System.out.println("College Name = " + clzName);
    }

    // instance method
    void instanceMethod() {
        staticMethod();
    }

    public static void main(String[] args) {
        d_static_methods obj = new d_static_methods();
        staticMethod();
        obj.instanceMethod();
    }
}
