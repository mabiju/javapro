package X_Exception_Handling;

import java.util.Scanner;

// creating user-defined exception
class InvalidProductWeightException extends Exception {
    public InvalidProductWeightException(String s) {
        super(s);
    }
}

public class j_exception_user_defined_throws_product_weight {
    void checkProductWeight(int weight) throws InvalidProductWeightException {
        if (weight < 100) {
            throw new InvalidProductWeightException("Product weight is not valid.");
        } else {
            System.out.println("The product is ready to deliver");
        }
    }

    public static void main(String[] args) {
        j_exception_user_defined_throws_product_weight obj = new j_exception_user_defined_throws_product_weight();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of the product:");
        int wt = sc.nextInt();
        sc.close();
        try {
            obj.checkProductWeight(wt);
        } catch (InvalidProductWeightException ex) {
            System.out.println("Invalid product found.");
            System.out.println(ex.getMessage());
        }
    }
}
