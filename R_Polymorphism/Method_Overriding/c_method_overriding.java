package R_Polymorphism.Method_Overriding;

class Human {
    // Overridden Method
    public void walk() {
        System.out.println("Human walks");
    }
}

public class c_method_overriding extends Human {
    // Overriding Method
    public void walk() {
        System.out.println("Boy walks");
    }

    public static void main(String args[]) {
        /*
         * Reference is of Human type and object is
         * Boy type
         */
        Human obj = new c_method_overriding();
        /*
         * Reference is of Human type and object is
         * of Human type.
         */
        Human obj2 = new Human();
        obj.walk();
        obj2.walk();
    }
}
