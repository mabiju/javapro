/* use of this keyword to invoke current class constructor
calling default constructor from parameterized constructor */
package M_This_Keyword;

class Nums {
    Nums() {
        System.out.println("Default constructor is invoked.");
    }

    Nums(int a) {
        this();
        System.out.println("The value of a = " + a);
    }
}

public class c_this_current_class_constructor {
    public static void main(String[] args) {
        // Nums obj = new Nums(23);
        new Nums(23);
    }
}
