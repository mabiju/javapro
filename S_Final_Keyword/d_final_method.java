package S_Final_Keyword;

class Teacher {
    // public final void work() {
    public void work() {
        System.out.println("Teacher is teaching");
    }
}

public class d_final_method extends Teacher {
    @Override
    public void work() {
        System.out.println("Student is studying.");
    }

    public static void main(String[] args) {
        d_final_method obj = new d_final_method();
        Teacher t1 = new Teacher();
        Teacher t2 = new d_final_method();
        t1.work();
        t2.work();
        obj.work();
    }
}