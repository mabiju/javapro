package W_Inheritance_Constructor;

class GrandDad {
    GrandDad() {
        System.out.println("Dafault constructor from GrandDad class.");
    }

    GrandDad(int x) {
        System.out.println("Parameterized constructor of GrandDad class with value of x = " + x);
    }
}

class Dad extends GrandDad {
    Dad() {
        System.out.println("Dafault constructor from Dad class.");
    }

    Dad(int x, int y) {
        super(x);
        System.out.println("Parameterized constructor of Dad class with value of y = " + y);
    }
}

class Son extends Dad {
    Son() {
        System.out.println("Dafault constructor from Son class.");
    }

    Son(int x, int y, int z) {
        super(x, y);
        System.out.println("Parameterized constructor of Son class with value of z = " + z);
    }
}

public class a_inheritance_constructor {
    public static void main(String[] args) {
        // GrandDad g = new GrandDad();
        // GrandDad h = new GrandDad(10);
        // Dad d = new Dad();
        // Dad e = new Dad(34,20);
        // Son s = new Son();
        // Son t = new Son(10, 20, 30);
        new Son();
        new Son(10, 20, 30);
    }
}
