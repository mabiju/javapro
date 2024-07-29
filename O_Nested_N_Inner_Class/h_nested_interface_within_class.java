package O_Nested_N_Inner_Class;

class Hi {
  interface Message {
    void display();
  }
}

public class h_nested_interface_within_class implements Hi.Message {
  public void display() {
    System.out.println("Hi Sanothimi");
  }

  public static void main(String args[]) {
    Hi.Message message = new h_nested_interface_within_class();// upcasting here
    message.display();
  }
}
