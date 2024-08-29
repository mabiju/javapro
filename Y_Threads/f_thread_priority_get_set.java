package Y_Threads;

class ThreadDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

public class f_thread_priority_get_set {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        /*
         * Thread t = new Thread(td,"Hello");
         * System.out.println("Thread Priority = " + t.getPriority());
         * System.out.println("Thread Name = " + t.getName());
         */

        Thread t1 = new Thread(td, "Ram");
        Thread t2 = new Thread(td, "Sita");
        Thread t3 = new Thread(td, "Laxman");

        t1.setPriority(3);
        t1.setPriority(2);
        t1.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
