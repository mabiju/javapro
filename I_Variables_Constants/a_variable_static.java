package I_Variables_Constants;

class Student {
    static int clzId = 45;
    int roll;
    String name;

    void input(int r, String n) {
        roll = r;
        name = n;
    }

    void output() {
        System.out.println("\nCollege id = " + clzId);
        System.out.println("Roll no = " + roll);
        System.out.println("Name = " + name);
    }
}

public class a_variable_static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input(11, "Ram");
        s1.output();
        
        Student.clzId = 67;
        Student s2 = new Student();
        s2.input(13, "Sita");
        s2.output();
    }
}
