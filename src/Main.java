import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) {

        interfazCalculadora ventana = new interfazCalculadora() {
            @Override
            public double sumar(double a, double b) throws RemoteException {
                return 0;
            }

            @Override
            public double restar(double a, double b) throws RemoteException {
                return 0;
            }

            @Override
            public double dividir(double a, double b) throws RemoteException {
                return 0;
            }

            @Override
            public double multiplicar(double a, double b) throws RemoteException {
                return 0;
            }
        };

        ventana.setVisible(true);
    }
}