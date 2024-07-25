// use of this keyoword to pass an argument in the method call
package M_This_Keyword;

public class f_this_pass_an_argument_method_call {
    void hello(f_this_pass_an_argument_method_call obj) {
        System.out.println("Hello Sanothimi");
    }

    void hi() {
        hello(this);
    }

    public static void main(String[] args) {
        f_this_pass_an_argument_method_call s1 = new f_this_pass_an_argument_method_call();
        s1.hi();
    }
}
