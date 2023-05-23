import javax.swing.*;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class clienteRMI {
    public static void main(String[] args) {
        try{
            String nombre = JOptionPane.showInputDialog("ingresa nombre");
            String nom = nombre;

            Registry rmii = LocateRegistry.getRegistry("localhost", 3135);

            chatServidor servidor = (chatServidor) rmii.lookup("Chat");
            new Thread(new implementacionClienteChat(nom,servidor)).start();
        } catch (RemoteException | NotBoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
