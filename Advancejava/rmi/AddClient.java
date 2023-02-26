import java.rmi.*;
public class AddClient {
    public static void main(String[] args) throws RemoteException{
        try{
            String addServerURL = "rmi://" + args[0] + "/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
            System.out.println("The first number is: "+args[1]);
            double d1 = Double.valueOf(args[1]).doubleValue();
            System.out.println("The Second Number is: "+args[2]);
            double d2 = Double.valueOf(args[2]).doubleValue();
            System.out.println("The Sum is: "+addServerIntf.add(d1, d2));
            System.out.println("The Subtraction is: "+addServerIntf.sub(d1,d2));
        }
        catch(Exception e)
        {
            System.out.println("Exception "+e);
        }j

    }
}
