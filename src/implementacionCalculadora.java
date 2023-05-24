import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class implementacionCalculadora extends UnicastRemoteObject implements operaciones, Serializable {
    public ArrayList<calculadoraCliente> clientes;
    public ArrayList<Double> numeros;
    protected implementacionCalculadora() throws RemoteException {
        super();
        clientes = new ArrayList<calculadoraCliente>();
        numeros = new ArrayList<Double>();
    }

    public void registro(calculadoraCliente cliente) throws RemoteException{
        this.clientes.add(cliente);
    }

     public void setnum(double num1)throws RemoteException{
        numeros.add(num1);
     }

    public ArrayList<Double> getNumeros()throws RemoteException {
        return numeros;
    }

    @Override
    public void mensaje(String mensaje) throws RemoteException {

    }

}
