package Y_Threads;

class One extends Thread {
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("Hi");
        }
    }
}

class Two extends Thread {
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("Hello");
        }
    }
}

public class b_thread {
    public static void main(String[] args) {
        One obj1 = new One();
        Two obj2 = new Two();

        obj1.start();
        obj2.start();
    }
}
