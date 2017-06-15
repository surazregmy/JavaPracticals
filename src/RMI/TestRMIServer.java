package RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by suraz on 4/28/17.
 */
public class TestRMIServer implements TestInterface {

    public  TestRMIServer(){}
    public double add(double d1, double d2) throws RemoteException {
        return d1+d2;
    }
    public double sub(double d1, double d2) throws RemoteException{
        return d1-d2;
    }
    public static void main(String[] args) {

        try {
//            MehodImpl mimpl = new MehodImpl();
            TestRMIServer testRMIServer = new TestRMIServer();
            TestInterface testInterface = (TestInterface) UnicastRemoteObject.exportObject(testRMIServer,0);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("test",testInterface);
//            Naming.rebind("test",); // Register mimpl object as test name
        }
        catch (Exception e){
            System.out.println("Error in Server: "+ e);
        }
    }
}
