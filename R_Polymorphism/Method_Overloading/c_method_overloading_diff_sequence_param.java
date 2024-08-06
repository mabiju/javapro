// demonstrating method overloading based on different sequence of parameters.
package R_Polymorphism.Method_Overloading;

class SumDemo {
    void add(int a, double b) {
        System.out.println("The sum = " + (a + b));
    }

    void add(double a, int b) {
        System.out.println("The sum = " + (a + b));
    }
}

public class c_method_overloading_diff_sequence_param {
    public static void main(String[] args) {
        SumDemo obj1 = new SumDemo();
        obj1.add(12, 23.45);
        obj1.add(12.45, 23);
    }
}
