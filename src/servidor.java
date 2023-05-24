import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class servidor {
    public static void main(String[] args) {
        try {
            
            // Crear un registro RMI en el puerto 1099
            Registry registry = LocateRegistry.createRegistry(1005);

            // Registrar la instancia de la calculadora en el registro RMI
            registry.rebind("Calculadora", new implementacionCalculadora());

            System.out.println("Servidor listo");
        } catch (Exception e) {
            System.err.println("Error en el servidor: " + e.toString());
        }
    }

    public static void mensaje(String s) {
    }
}
