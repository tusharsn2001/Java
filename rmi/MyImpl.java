import java.rmi.*;
import java.rmi.server.*;
public class MyImpl extends UnicastRemoteObject implements MyInterface {
    
    public String msg;
    public MyImpl(String ms) throws RemoteException {
        msg = ms;
    }
    public String say() throws RemoteException{
        return msg;
    }
}
