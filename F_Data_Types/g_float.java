package F_Data_Types;

public class g_float {
    public static void main(String[] args) {
        float num_float = 25.35F;
        // float num_float = 25.35f;
        // float num_float = 25.35; // not acceptable
        System.out.println(num_float);
    }
}

/*
 * Notice that we have used 25.35f instead for 25.35 in the above program. It's
 * because 25.35 is a double lirerals.
 * To tell the compiler to treat 25.35 as float rather than double,
 * we need to use f or F in suffix.
 */
