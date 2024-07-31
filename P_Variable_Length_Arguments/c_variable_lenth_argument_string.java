package P_Variable_Length_Arguments;

public class c_variable_lenth_argument_string {
    // public void displayNames(String... str) {
    public static void displayNames(String... str) {
        System.out.println("\nNumber of arguments " + str.length);
        System.out.println("The values are:");
        for (String s : str) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        /* c_variable_lenth_argument_string obj = new c_variable_lenth_argument_string();
        obj.displayNames();
        obj.displayNames("Ram", "Sita", "Hari", "Gita");
        obj.displayNames("Jack", "Danials", "John", "Catherine", "Harry");
        obj.displayNames("Saraswati", "Ramkumari"); */

        displayNames();
        displayNames("Ram", "Sita", "Hari", "Gita");
        displayNames("Jack", "Danials", "John", "Catherine", "Harry");
        displayNames("Saraswati", "Ramkumari");
    }
}
