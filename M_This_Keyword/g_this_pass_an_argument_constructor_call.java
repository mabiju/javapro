// use of this keyoword to pass an argument in the constructor call
package M_This_Keyword;

class Student_demo {
    g_this_pass_an_argument_constructor_call obj;

    Student_demo(g_this_pass_an_argument_constructor_call obj) {
        this.obj = obj;
    }

    void display() {
        // using 'a', memmber of g_this_pass_an_argument_constructor_call class
        System.out.println("The value of a = " + obj.a);
    }
}

public class g_this_pass_an_argument_constructor_call {
    int a = 5;

    g_this_pass_an_argument_constructor_call() {
        Student_demo s1 = new Student_demo(this);
        s1.display();
    }

    public static void main(String[] args) {
        // g_this_pass_an_argument_constructor_call obj1 = new
        // g_this_pass_an_argument_constructor_call();
        new g_this_pass_an_argument_constructor_call();
    }
}
