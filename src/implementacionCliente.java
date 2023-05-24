import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class implementacionCliente extends UnicastRemoteObject implements calculadoraCliente, Runnable {

    operaciones servidorop;

    public String nombre = null;
    private String num;

    protected implementacionCliente(String nombre, operaciones servidorop) throws RemoteException{
        this.nombre = nombre;
        this.servidorop = servidorop;
        servidorop.registro(this);
    }

    @Override
    public void mensajeCliente(String mensaje) throws RemoteException {
        servidorop.setnum(Double.parseDouble(mensaje));
    }

    @Override
    public String getnombre() throws RemoteException {
        return null;
    }

    public void setop(String num) {

        this.num = num;
    }

    @Override
    public void run() {
        Scanner s = new Scanner(System.in);
        String mensaje;
        while (true){
            mensaje = s.nextLine();
            servidor.mensaje(nombre + ":" + mensaje);
        }
    }
}
