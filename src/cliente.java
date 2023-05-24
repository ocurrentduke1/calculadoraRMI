import javax.swing.*;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class cliente {
    public static void main(String[] args) {
        try{
            String nombre = JOptionPane.showInputDialog("ingresa nombre");
            String nom = nombre;

            Registry rmii = LocateRegistry.getRegistry("localhost", 1005);

            operaciones servidorop = (operaciones) rmii.lookup("Chat");
            new Thread(new implementacionCliente(nom,servidorop)).start();
        } catch (RemoteException | NotBoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
