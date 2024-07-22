package K_Constructors;

public class d_parameterized_constructor {
    d_parameterized_constructor() {
        System.out.println("Dafault constructor is called.");
    }

    d_parameterized_constructor(int a) {
        System.out.println("Parameterized constructor with only an integer value.");
    }

    d_parameterized_constructor(int a, int b) {
        System.out.println("Parameterized constructor with two integer values.");
    }

    d_parameterized_constructor(int a, String b) {
        System.out.println("Parameterized constructor with an integer value and a string.");
    }

    public static void main(String[] args) {
        /*
         * d_parameterized_constructor obj1 = new d_parameterized_constructor();
         * d_parameterized_constructor obj2 = new d_parameterized_constructor(24);
         * d_parameterized_constructor obj3 = new d_parameterized_constructor(45,78);
         * d_parameterized_constructor obj4 = new d_parameterized_constructor(67,
         * "Ram");
         */
        new d_parameterized_constructor(12, "Ram");
        new d_parameterized_constructor();
        new d_parameterized_constructor(12);
        new d_parameterized_constructor(12, 23);

    }
}
