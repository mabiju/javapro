package T_Abstract_Classes;

abstract class Sanothimi {
    // abstract method
    abstract void hi();

    // non abstract method
    public void hello() {
        System.out.println("Hello Sanothimi");
    }
}

class Student extends Sanothimi {
    public void hi() {
        System.out.println("Hi Sanothimi");
    }
}

public class c_abastract {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.hi();
        s1.hello();
    }
}
