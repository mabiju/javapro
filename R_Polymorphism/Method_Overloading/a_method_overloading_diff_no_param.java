// demonstrating method overloading based on different number of parameters.
package R_Polymorphism.Method_Overloading;

class Calc {
    void display(int a) {
        System.out.println("The value of a = " + a);
    }

    void display(int a, int b) {
        System.out.println("The value of a = " + a + " and b = " + b);
    }

    void display(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

public class a_method_overloading_diff_no_param {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.display(23);
        obj.display(23, 67);
        obj.display(23, 89, 234);
    }
}
