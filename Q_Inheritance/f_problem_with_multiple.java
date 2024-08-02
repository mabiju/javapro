package Q_Inheritance;

class Dad {
    void hi() {
        System.out.println("Hi child, love you from your dad.");
    }
}

class Mom {
    void hello() {
        System.out.println("Hello child, love you from your mom.");
    }
}

/* class Child extends Dad, Mom
{
    void greetings()
    {
        System.out.println("Greetings !! Parents");
    }

    Note : Multiple inheritance is not possible with Java Class, possible with Java Interface. 
}*/

public class f_problem_with_multiple {
    public static void main(String[] args) {
        /* Child c1 = new Child();
        c1.greetings();
        c1.hi();
        c1.hello(); */
    }
}
