package Q_Inheritance;

class BaseClass {
    void hi() {
        System.out.println("This is method from base class.");
    }
}

class DerivedClass extends BaseClass {
    void hi() {
        System.out.println("This is method from derived class.");
    }
}

public class d_single_same_method {
    public static void main(String[] args) {
        BaseClass b1 = new BaseClass();
        // DerivedClass d1 = new DerivedClass();
        BaseClass d2 = new DerivedClass();

        b1.hi();
        // d1.hi();
        d2.hi();
    }
}
