package U_Interface;

interface IFather {
    public void teach();
}

interface IMother {
    public void feed();
}

class Home {
    public void shelter() {
        System.out.println("Home is providing shelter.");
    }
}

public class c_interface_class_inheriting extends Home implements IFather, IMother {
    public static void main(String[] args) {
        c_interface_class_inheriting obj = new c_interface_class_inheriting();
        obj.shelter();
        obj.teach();
        obj.feed();
    }

    @Override
    public void teach() {
        System.out.println("Father is teaching us.");
    }

    @Override
    public void feed() {
        System.out.println("Mother is feeding us.");
    }
}
