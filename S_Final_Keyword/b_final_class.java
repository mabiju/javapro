package S_Final_Keyword;

// final class Super {
class Super {
    void hello() {
        System.out.println("This is method from super class.");
    }
}

class Sub extends Super {
    void hi() {
        System.out.println("This is method from sub class.");
    }
}

public class b_final_class {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.hi();
        obj.hello();
    }
}
