package O_Nested_N_Inner_Class;

// outer class
public class a_member_inner_class {
    String clzName = "Sanothimi";

    // inner class
    class InnerClassOne {
        void display() {
            System.out.println("College name = " + clzName);
        }
    }

    public static void main(String[] args) {
        a_member_inner_class obj = new a_member_inner_class();
        a_member_inner_class.InnerClassOne inObj = obj.new InnerClassOne();
        inObj.display();
    }
}
