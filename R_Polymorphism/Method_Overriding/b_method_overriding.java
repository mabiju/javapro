package R_Polymorphism.Method_Overriding;

class GrandPa {
    void hello() {
        System.out.println("Hello from grandpa");
    }
}

class Dad extends GrandPa {
    void hello() {
        System.out.println("Hello from dad");
    }
}

class Child extends Dad {
    void hello() {
        System.out.println("Hello from Child");
    }
}

public class b_method_overriding {
    public static void main(String[] args) {
        GrandPa a, b, c;
        a = new GrandPa();
        b = new Dad();
        c = new Child();

        a.hello();
        b.hello();
        c.hello();
    }
}
