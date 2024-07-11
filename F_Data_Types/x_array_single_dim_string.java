package F_Data_Types;

public class x_array_single_dim_string {
    public static void main(String[] args) {
        String[] names = { "Ram", "Sita", "Laxman", "Hari", "Gita", "Nita", "Bhim", "Dambar" };
        // System.out.println(names[5]); // Nita
        // for (int i = 0; i < names.length; i++) {
        // System.out.println(names[i]);
        // }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
