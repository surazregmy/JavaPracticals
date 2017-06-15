package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by suraz on 4/28/17.
 */
public class MehodImpl extends UnicastRemoteObject implements TestInterface {
    public MehodImpl() throws RemoteException{}
    public double add(double d1, double d2) throws RemoteException{
        return d1+d2;
    }
    public double sub(double d1, double d2) throws RemoteException{
        return d1-d2;
    }

}
