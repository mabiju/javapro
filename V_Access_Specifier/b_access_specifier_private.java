package V_Access_Specifier;

class Student
{
    // private int roll = 420; // cannot accessible out of class
    public int roll = 420;
}
public class b_access_specifier_private {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Roll number = " + s1.roll);
    }
}
