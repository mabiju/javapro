package P_Variable_Length_Arguments;

public class a_method_without_variable_lengh_arguments {

    public int add(int a, int b) {
        return (a + b);
    }

    public int add(int a, int b, int c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        a_method_without_variable_lengh_arguments obj = new a_method_without_variable_lengh_arguments();
        System.out.println("The sum of two integers = " + obj.add(23, 47));
        System.out.println("The sum of three integers = " + obj.add(23, 47, 56));
    }
}
