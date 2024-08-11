package U_Interface;

interface ICollege {
    public void study();
}

class Student implements ICollege {
    @Override
    public void study() {
        System.out.println("Students are studying.....");
    }
}

public class a_interface_abstraction {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.study();
    }
}
