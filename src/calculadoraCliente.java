import java.rmi.Remote;
import java.rmi.RemoteException;

public interface calculadoraCliente extends Remote {

    void mensajeCliente(String mensaje) throws RemoteException;

    String getnombre() throws RemoteException;
}
