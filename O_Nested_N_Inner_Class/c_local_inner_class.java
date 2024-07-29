package O_Nested_N_Inner_Class;

public class c_local_inner_class {
    int clzId = 27;

    void displayClzId() {
        class InnerClassThree {
            void display() {
                System.out.println("College id = " + clzId);
            }
        }
        InnerClassThree in = new InnerClassThree();
        in.display();
    }

    public static void main(String[] args) {
        c_local_inner_class obj = new c_local_inner_class();
        obj.displayClzId();
    }
}
