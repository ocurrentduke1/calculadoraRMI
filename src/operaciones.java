import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface operaciones extends Remote {

    public void registro(calculadoraCliente cliente) throws RemoteException;
    public void setnum(double num1)throws RemoteException;
    public ArrayList<Double> getNumeros()throws RemoteException;
    void mensaje(String mensaje) throws RemoteException;

}
