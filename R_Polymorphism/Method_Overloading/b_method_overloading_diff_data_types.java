// demonstrating method overloading based on different data types on parameters.
package R_Polymorphism.Method_Overloading;

class Nums {
    int sum(int a, int b) {
        return (a + b);
    }

    double sum(double a, double b) {
        return (a + b);
    }
}

public class b_method_overloading_diff_data_types {
    public static void main(String[] args) {
        Nums obj = new Nums();
        int sum1 = obj.sum(12, 23);
        double sum2 = obj.sum(23.55, 56.78);
        System.out.println("Sum of integers = " + sum1);
        System.out.println("Sum of doubles = " + sum2);
    }
}
