package Y_Threads;

class MyThread extends Thread {
    public void run() {
        System.out.println("My thread is running......");
    }
}

public class d_thread {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);

        t.start();
    }
}
