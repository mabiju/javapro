package C_Basic_IO_Class_n_Object;

class Student {
    int roll = 5;
    String name = "Ram";
}

public class c_class_outside_main_class {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Roll no = " + s1.roll);
        System.out.println("Name = " + s1.name);
    }
}
