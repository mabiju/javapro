// write a program in Java to display the Employee details using Console Class.
package Z_Console_IO;

import java.io.Console;

public class h_console_employee_details {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter employee ID :");
        int emp_id = Integer.parseInt(c.readLine());
        System.out.println("Enter employee name :");
        String emp_name = c.readLine();
        System.out.println("Enter employee address :");
        String emp_add = c.readLine();
        System.out.println("Enter employee salary :");
        int emp_sal = Integer.parseInt(c.readLine());

        System.out.println("Employee ID = " + emp_id);
        System.out.println("Employee Name = " + emp_name);
        System.out.println("Employee Address = " + emp_add);
        System.out.println("Employee Salary = " + emp_sal);

    }
}
