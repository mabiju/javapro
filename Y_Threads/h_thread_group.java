package Y_Threads;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Running = " + Thread.currentThread().getName());
    }
}

public class h_thread_group {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        ThreadGroup tg = new ThreadGroup("Group A");

        Thread t1 = new Thread(tg, myRunnable, "Thread One");
        Thread t2 = new Thread(tg, myRunnable, "Thread Two");
        Thread t3 = new Thread(tg, myRunnable, "Thread Three");

        t1.start();
        t2.start();
        t3.start();

        // Returns the name of the thread group
        System.out.println("The thread group name is = " + tg.getName());

        // displays the details about the thread group to the standard output
        tg.list();
    }
}
