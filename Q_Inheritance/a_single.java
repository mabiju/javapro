package Q_Inheritance;

class SuperClass {
    void hi() {
        System.out.println("Hi sanothimi");
    }
}

class SubClass extends SuperClass {
    void hello() {
        System.out.println("Hello Sanothimi");
    }
}

public class a_single {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.hello();
        obj.hi(); // accessing SuperClass method
    }
}
