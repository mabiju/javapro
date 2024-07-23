package K_Constructors;

public class g_copy_constructor {
    int roll;
    String name;

    g_copy_constructor(int r, String n) {
        roll = r;
        name = n;
    }
    // copy constructor
    g_copy_constructor(g_copy_constructor stu) {
        System.out.println("\nAfter invoking copy constructor");
        roll = stu.roll;
        name = stu.name;
    }

    int displayRoll() {
        return roll;
    }

    String displayName() {
        return name;
    }

    public static void main(String[] args) {
        g_copy_constructor s1 = new g_copy_constructor(11, "Ram");
        System.out.println("Roll = " + s1.displayRoll());
        System.out.println("Name = " + s1.displayName());

        g_copy_constructor s2 = new g_copy_constructor(s1);
        System.out.println("Roll = " + s2.displayRoll());
        System.out.println("Name = " + s2.displayName());
    }
}
