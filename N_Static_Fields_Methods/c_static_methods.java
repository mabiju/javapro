package N_Static_Fields_Methods;

public class c_static_methods {
    // instance variable
    int a = 10;

    // static variable
    static int b = 20;

    // instance method
    void displayInstanceMethod() {
        System.out.println("The value of a = " + a);
        System.out.println("The value of b = " + b);
    }

    // static method
    static void displayStaticMethod() {
        // System.out.println("The value of a = " + a); // error
        System.out.println("The value of b = " + b);
    }

    public static void main(String[] args) {
        c_static_methods obj = new c_static_methods();
        obj.displayInstanceMethod();
        displayStaticMethod();
    }
}
