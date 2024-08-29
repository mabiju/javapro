package Y_Threads;

public class i_thread_calling_threads {
    public void call(String msg) {
        System.out.print("[" + msg);
        try {
            System.out.print("]");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.print("Interrupted");
        }
    }

    public static void main(String[] args) {
        i_thread_calling_threads obj = new i_thread_calling_threads();
        obj.call("Hello Sanothimi");
        System.out.println("This runs after calling threads.....");
    }
}
