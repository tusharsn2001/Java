import java.rmi.Naming;

public class addServer {
    public static void main(String[] args) {
        try {
            MyImpl obj1 = new MyImpl("Hello there");
            Naming.rebind("Yes", obj1);
            System.out.println("Server Ready");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Server failed");
        }
    }
}