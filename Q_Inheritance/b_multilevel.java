package Q_Inheritance;

class GrandPa {
    void grand() {
        System.out.println("Hello from grandpa.");
    }
}

class Father extends GrandPa {
    void dad() {
        System.out.println("Hello from father");
    }
}

class GrandChild extends Father {
    void child() {
        System.out.println("Greetings from grandchild");
    }
}

public class b_multilevel {
    public static void main(String[] args) {
        GrandChild c1 = new GrandChild();
        c1.child();
        c1.dad();
        c1.grand();
    }
}
