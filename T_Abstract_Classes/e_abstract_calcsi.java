package T_Abstract_Classes;

import java.util.Scanner;

abstract class CalcSi {
    abstract double RateOfInterest(double m, double n);
}

class EverestBank extends CalcSi {
    double r = 4.5;

    public double RateOfInterest(double p, double t) {
        return (p * t * r) / 100;
    }
}

class NabilBank extends CalcSi {
    double r = 5.5;

    public double RateOfInterest(double p, double t) {
        return (p * t * r) / 100;
    }
}

public class e_abstract_calcsi {
    public static void main(String[] args) {
        CalcSi c1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount:");
        double p = sc.nextDouble();
        System.out.println("Enter time:");
        double t = sc.nextDouble();

        c1 = new EverestBank();
        System.out.println("Simple Interest in Everest bank = " + c1.RateOfInterest(p, t));
        c1 = new NabilBank();
        System.out.println("Simple Interest in Nabil bank = " + c1.RateOfInterest(p, t));

        sc.close();
    }
}
