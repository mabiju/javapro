package Y_Threads;

class MeroThread implements Runnable{
    public void run() {
        System.out.println("My thread is running......");
    }
}

public class e_thread_runnable {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);

        t.start();
    }
}
