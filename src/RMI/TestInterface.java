package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by suraz on 4/28/17.
 */
public interface TestInterface extends Remote {
    double add(double d1, double d2) throws RemoteException;
    double sub(double d1, double d2) throws RemoteException;
}
