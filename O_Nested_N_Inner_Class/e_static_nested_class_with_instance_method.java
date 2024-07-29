package O_Nested_N_Inner_Class;

// outer class
public class e_static_nested_class_with_instance_method {
    static int roll = 25;

    // inner class
    static class InnnerClass {
        void showRoll() {
            System.out.println("Roll number is = " + roll);
        }
    }

    public static void main(String[] args) {
        e_static_nested_class_with_instance_method.InnnerClass obj = new e_static_nested_class_with_instance_method.InnnerClass();
        obj.showRoll();
    }
}

/* 
you need to create the instance of static nested class because it has instance method showRoll(). 
But you don't need to create the object of the Outer class because the nested class is static and static properties, 
methods, or classes can be accessed without an object. 
*/
