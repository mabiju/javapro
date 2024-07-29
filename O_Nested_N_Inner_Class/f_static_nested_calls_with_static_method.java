package O_Nested_N_Inner_Class;

public class f_static_nested_calls_with_static_method {
    static int roll = 27;
  
    static class InnerClass {
      static void display() {
        System.out.println("Roll number is " + roll);
      }
    }
  
    public static void main(String args[]) {
      // no need to create the instance of static nested class
      f_static_nested_calls_with_static_method.InnerClass.display();
    }
  }
  
