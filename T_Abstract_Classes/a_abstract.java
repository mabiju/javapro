package T_Abstract_Classes;

abstract class Dad {
    abstract void hi();
}

class Son extends Dad {
    @Override
    public void hi() {
        System.out.println("Hi from your son.");
    }
}

class Daughter extends Dad {

    @Override
    void hi() {
        System.out.println("Hi from your daughter.");
    }

}

public class a_abstract {
    public static void main(String[] args) {
        Dad d1 = new Son();
        Dad d2 = new Daughter();
        d1.hi();
        d2.hi();
    }
}
