package Q_Inheritance;

class Vehicle
{
    void accelerate()
    {
        System.out.println("I am moving towards my destination.");
    }
}

class Aeroplane extends Vehicle
{
    void fly()
    {
        System.out.println("I am flying.");
    }
}

class Motorbike extends Vehicle
{
    void run()
    {
        System.out.println("I am runnin on road.");
    }
}

public class c_heirarchical {
    public static void main(String[] args) {
        Aeroplane Boeing467 = new Aeroplane();
        Boeing467.accelerate();
        Boeing467.fly();
        // Boeing467.run(); // error

        Motorbike Ninja1100 = new Motorbike();
        Ninja1100.accelerate();
        Ninja1100.run();
        // Ninja1100.fly(); // error
    }
}
