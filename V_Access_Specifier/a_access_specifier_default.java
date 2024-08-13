package V_Access_Specifier;

class Nums {
    // there is not any access specifier used, i.e. default
    int a = 5;
}

public class a_access_specifier_default {
    public static void main(String[] args) {
        Nums obj = new Nums();
        System.out.println("The value of a = " + obj.a);
    }
}
