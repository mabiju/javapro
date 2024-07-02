package C_Basic_IO_Class_n_Object;
import java.util.Scanner;

class Studnt {
    int roll;
    int age;
    String name;

    void getdata(Scanner sc) {
        roll = sc.nextInt();
        age = sc.nextInt();
        name = sc.next();
    }

    void display() {
        System.out.println("Roll =" + roll);
        System.out.println("Age =" + age);
        System.out.println("Name =" + name);
    }
}

public class e_user_input_student_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of the student1:");
        Studnt st1 = new Studnt();
        st1.getdata(sc);

        System.out.println("Enter the details of the student2:");
        Studnt st2 = new Studnt();
        st2.getdata(sc);

        System.out.println("Enter the details of the student3:");
        Studnt st3 = new Studnt();
        st3.getdata(sc);

        System.out.println("Details of the student1:");
        st1.display();

        System.out.println("Details of the student2:");
        st2.display();

        System.out.println("Details of the student3:");
        st3.display();
        sc.close();
    }
}