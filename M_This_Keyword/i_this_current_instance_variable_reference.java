/* this keyword refers to the current class instance
 * variable. Here down below, we're displaying reference
 * variable and the output of both variable will be same.
 */
package M_This_Keyword;

public class i_this_current_instance_variable_reference {
    void hi() {
        System.out.println(this); // displays same reference id
    }

    public static void main(String[] args) {
        i_this_current_instance_variable_reference obj = new i_this_current_instance_variable_reference();
        System.out.println(obj); // displays the reference id
        obj.hi();
    }
}
