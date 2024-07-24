// use of this keyword for constructor call
package M_This_Keyword;

class StudentDemo {
    int roll;
    String name, course;
    float marks;

    StudentDemo(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    StudentDemo(int roll, String name, String course, float marks) {
        this(roll, name, course); // resuse of constructor using this keyword
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("\nRoll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Course = " + course);
        System.out.println("Marks = " + marks);
    }
}

public class e_this_current_class_constructor {
    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo(11, "Ram", "ICT");
        StudentDemo s2 = new StudentDemo(12, "Sita", "Science", 45.67f);
        s1.displayDetails();
        s2.displayDetails();
    }
}
