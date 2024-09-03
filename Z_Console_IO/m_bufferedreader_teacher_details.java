/* Write a program in Java to send teachers id, name, address, department and salary as
user input parameters through constructor and display the teachers details using BufferedReader
Console IO. */

package Z_Console_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Teacher {
    int id, salary;
    String name, address, department;

    public Teacher(int id, int salary, String name, String address, String department) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.address = address;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Teachers ID = " + id);
        System.out.println("Teacher's Name = " + name);
        System.out.println("Teacher's Address = " + address);
        System.out.println("Teacher's Department = " + department);
        System.out.println("Teacher's Salary = " + salary);
    }
}

public class m_bufferedreader_teacher_details {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the following details for a teacher:");
        System.out.println("Enter teacher's id:");
        int t_id = Integer.parseInt(reader.readLine());

        System.out.println("Enter teacher's salary:");
        int t_salary = Integer.parseInt(reader.readLine());

        System.out.println("Enter teacher's Name:");
        String t_name = reader.readLine();

        System.out.println("Enter teacher's Address:");
        String t_address = reader.readLine();

        System.out.println("Enter teacher's Department:");
        String t_department = reader.readLine();

        Teacher t1 = new Teacher(t_id, t_salary, t_name, t_address, t_department);
        System.out.println("\nDisplaying the details of Teacher:");
        t1.displayDetails();
    }
}
