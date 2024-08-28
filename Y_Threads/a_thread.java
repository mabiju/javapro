package Y_Threads;

public class a_thread {
    public static void main(String[] args) {
        Thread t1 = new Thread("Ram");
        Thread t2 = new Thread("Sita");

        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}
