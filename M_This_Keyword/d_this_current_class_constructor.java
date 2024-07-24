/* use of this keyword to invoke current class constructor
calling parameterized constructor from default constructor */
package M_This_Keyword;

class Calc {
    Calc() {
        this(45);
        System.out.println("Default constructor invoked.");
    }

    Calc(int a) {
        System.out.println("The value = " + a);
    }
}

public class d_this_current_class_constructor {
    public static void main(String[] args) {
        // Calc c1 = new Calc();
        new Calc();
    }
}
