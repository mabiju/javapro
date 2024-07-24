// use of this keyword to refer current class instance variable
package M_This_Keyword;

class Student {
    int roll;
    String name;
    float marks;

    /*
     * Student(int roll, String name, float marks) {
     * roll = roll;
     * name = name;
     * marks = marks;
     * }
     */

    /*
     * Student(int r, String n, float m) {
     * roll = r;
     * name = n;
     * marks = m;
     * }
     */

    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("\nRoll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }
}

public class a_this_current_class_instance_variable {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Ram", 22.34f);
        Student s2 = new Student(12, "Sita", 45.34f);
        s1.displayDetails();
        s2.displayDetails();
    }
}
