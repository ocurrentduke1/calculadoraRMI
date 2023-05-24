import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public abstract class interfazCalculadora extends JFrame implements operaciones {

    public static implementacionCliente implementacion;

    //variables
    double resultado = 0;

    static String nombre = JOptionPane.showInputDialog("ingresa nombre");
    static String nom = nombre;

    public interfazCalculadora() {
        this.setBounds(150, 0, 290, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        componentes();
        setLayout(null);
    }

    public void componentes() {
        //mensajes
        JLabel lblnombre = new JLabel("usuario: "+ nom);
        lblnombre.setBounds(20, 15, 200, 20);
        JLabel lblres = new JLabel("resultado: ");
        lblres.setBounds(20, 280, 200, 20);
        JLabel lblop = new JLabel("simbolo: ");
        lblop.setBounds(20, 250, 200, 20);
        //txtarea
        JTextArea txtnum = new JTextArea("");
        txtnum.setBounds(20, 50, 230, 30);
        //buttons numeros
        JButton btn1 = new JButton("1");
        btn1.setBounds(20, 90, 50, 30);
        JButton btn2 = new JButton("2");
        btn2.setBounds(80, 90, 50, 30);
        JButton btn3 = new JButton("3");
        btn3.setBounds(140, 90, 50, 30);
        JButton btn4 = new JButton("4");
        btn4.setBounds(20, 130, 50, 30);
        JButton btn5 = new JButton("5");
        btn5.setBounds(80, 130, 50, 30);
        JButton btn6 = new JButton("6");
        btn6.setBounds(140, 130, 50, 30);
        JButton btn7 = new JButton("7");
        btn7.setBounds(20, 170, 50, 30);
        JButton btn8 = new JButton("8");
        btn8.setBounds(80, 170, 50, 30);
        JButton btn9 = new JButton("9");
        btn9.setBounds(140, 170, 50, 30);
        JButton btn0 = new JButton("0");
        btn0.setBounds(20, 210, 50, 30);
        //buttons operaciones
        JButton btndiv = new JButton("/");
        btndiv.setBounds(200, 90, 50, 30);
        JButton btnmul = new JButton("X");
        btnmul.setBounds(200, 130, 50, 30);
        JButton btnsum = new JButton("+");
        btnsum.setBounds(200, 170, 50, 30);
        JButton btnres = new JButton("-");
        btnres.setBounds(200, 210, 50, 30);
        JButton btnequals = new JButton("=");
        btnequals.setBounds(80, 210, 50, 30);
        //btn funciones
        JButton btnclear = new JButton("CE");
        btnclear.setBounds(140, 210, 50, 30);
        JButton btnenviar = new JButton();
        //habilitar componentes
        this.getContentPane().add(lblnombre);
        this.getContentPane().add(lblres);
        this.getContentPane().add(lblop);
        this.getContentPane().add(txtnum);
        this.getContentPane().add(btn1);
        this.getContentPane().add(btn2);
        this.getContentPane().add(btn3);
        this.getContentPane().add(btn4);
        this.getContentPane().add(btn5);
        this.getContentPane().add(btn6);
        this.getContentPane().add(btn7);
        this.getContentPane().add(btn8);
        this.getContentPane().add(btn9);
        this.getContentPane().add(btn0);
        this.getContentPane().add(btndiv);
        this.getContentPane().add(btnsum);
        this.getContentPane().add(btnres);
        this.getContentPane().add(btnmul);
        this.getContentPane().add(btnequals);
        this.getContentPane().add(btnclear);

        //metodos de botones numericos

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    txtnum.append("1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtnum.append("2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtnum.append("3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtnum.append("4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtnum.append("5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtnum.append("6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtnum.append("7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                txtnum.append("8");

            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtnum.append("9");
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtnum.append("0");
            }
        });


        //metodos botones operacionales

        btnsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtnum.getText());
                lblop.setText("simbolo: +");
            }
        });

        btnres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtnum.getText());
                lblop.setText("simbolo: -");
            }
        });

        btnmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtnum.getText());
                lblop.setText("simbolo: X");
            }
        });

        btndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtnum.getText());
                lblop.setText("simbolo: /");
            }
        });

        btnequals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblres.setText("resultado:  " + resultado);
            }
        });

        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtnum.setText("");
            }
        });

    }

    public static void main(String[] args) throws NotBoundException, RemoteException {


        interfazCalculadora ventana = new interfazCalculadora() {
            @Override
            public void registro(calculadoraCliente cliente) throws RemoteException {

            }

            @Override
            public void setnum(double num1) throws RemoteException {

            }

            @Override
            public ArrayList<Double> getNumeros() throws RemoteException {
                return null;
            }

            @Override
            public void mensaje(String mensaje) throws RemoteException {

            }
        };
        ventana.setVisible(true);

        Registry registry;
        try {
            registry = LocateRegistry.getRegistry("localhost", 1005);
        }catch (RemoteException e){
            throw new RuntimeException(e);
        }
        operaciones operacionesop = (operaciones)registry.lookup("Calculadora") ;
        new Thread(new implementacionCliente(nom,operacionesop)).start();
    }
}