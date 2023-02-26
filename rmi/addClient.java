import java.rmi.*;

public class addClient {
    public static void main(String[] args) {
        try {
            MyInterface obj = (MyInterface) Naming.lookup("//localhost/MyImpl");
            System.out.println(obj.say());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
