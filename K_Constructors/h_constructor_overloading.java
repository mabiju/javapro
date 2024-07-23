package K_Constructors;

public class h_constructor_overloading {
    h_constructor_overloading() {
        System.out.println("Hello Constructor");
    }

    h_constructor_overloading(int a) {
        System.out.println("A = " + a);
    }

    h_constructor_overloading(int roll, String name) {
        System.out.println("Roll = " + roll + " and Name = " + name);
    }

    h_constructor_overloading(double b) {
        System.out.println("The double value = " + b);
    }

    public static void main(String[] args) {
        /* h_constructor_overloading obj1 = new h_constructor_overloading();
        h_constructor_overloading obj2 = new h_constructor_overloading(4);
        h_constructor_overloading obj3 = new h_constructor_overloading(11, "Ram");
        h_constructor_overloading obj4 = new h_constructor_overloading(24.56); */

        new h_constructor_overloading();
        new h_constructor_overloading(4);
        new h_constructor_overloading(11, "Ram");
        new h_constructor_overloading(24.56);
    }
}
