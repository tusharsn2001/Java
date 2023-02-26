import java.rmi.*;

public interface MyInterface extends Remote {
    public String say() throws RemoteException;

}
