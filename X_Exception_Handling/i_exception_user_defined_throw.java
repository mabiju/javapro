package X_Exception_Handling;

// creating an user-defined exception class
class MyException extends Exception {
    public MyException(String s) {
        // calling constructor of parent class
        super(s);
    }
}

public class i_exception_user_defined_throw {
    public static void main(String[] args) {
        try {
            // throw an object of user-defined exception
            throw new MyException("Exception thrown");
        } catch (MyException ex) {
            System.out.println("Exception caught");
            // printing the message from user defined exception
            System.out.println(ex.getMessage());
        }
    }
}
