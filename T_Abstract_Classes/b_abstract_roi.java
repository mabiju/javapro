package T_Abstract_Classes;

abstract class Bank {
    abstract double getRateOfInterest();
}

class GIME extends Bank {
    public double getRateOfInterest() {
        return 3.7;
    }
}

class NICASIA extends Bank {
    public double getRateOfInterest() {
        return 4.0;
    }
}

public class b_abstract_roi {
    public static void main(String[] args) {
        Bank b;
        b = new GIME();
        System.out.println("The interest rate in Global bank = " + b.getRateOfInterest() + "%");
        b = new NICASIA();
        System.out.println("The interest rate in NIC Asia bank = " + b.getRateOfInterest() + "%");
    }
}
