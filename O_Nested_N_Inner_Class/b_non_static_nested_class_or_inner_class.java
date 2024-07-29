package O_Nested_N_Inner_Class;

// outer class
class OuterClass {
    void show() {
        InnerClassTwo in = new InnerClassTwo();
        in.display();
    }

    // inner class 
    class InnerClassTwo {
        void display() {
            System.out.println("This is Innner class method");
        }
    }
}

public class b_non_static_nested_class_or_inner_class {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.show();
    }
}
