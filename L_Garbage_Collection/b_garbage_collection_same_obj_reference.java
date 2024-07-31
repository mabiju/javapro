package L_Garbage_Collection;

public class b_garbage_collection_same_obj_reference {
    public static void main(String[] args) {
        // uncomment the following before execution.
        /* a_garbage_collection_null obj1 = new a_garbage_collection_null();
        a_garbage_collection_null obj2 = new a_garbage_collection_null();
        obj2 = obj1; */

        System.gc();
    }

    public void finalize() {
        System.out.println("Gabage collected for memory management......");
    }
}
