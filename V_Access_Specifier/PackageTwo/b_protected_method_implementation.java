// accessing protected method out of package
package V_Access_Specifier.PackageTwo;

import V_Access_Specifier.PackageOne.a_protected_method;

public class b_protected_method_implementation extends a_protected_method {
    public static void main(String[] args) {
        b_protected_method_implementation obj = new b_protected_method_implementation();
        obj.hello();
    }
}
