import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;

public abstract class interfazCalculadora extends JFrame implements operaciones {

    //variables
    double resultado = 0;
    private JTextArea selectedTextArea;

    public interfazCalculadora() {
        this.setBounds(150, 0, 290, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        componentes();
        setLayout(null);
    }

    public void componentes() {
        //mensajes
        JLabel lblnombre = new JLabel("usuario: victor");
        lblnombre.setBounds(20, 15, 200, 20);
        JLabel lblres = new JLabel("resultado: ");
        lblres.setBounds(20, 250, 200, 20);
        JLabel lblop = new JLabel(":");
        lblop.setBounds(135, 50, 200, 20);
        //txtarea
        JTextArea txtnum = new JTextArea("");
        txtnum.setBounds(20, 50, 100, 30);
        JTextArea txtnum2 = new JTextArea("");
        txtnum2.setBounds(150, 50, 100, 30);
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
        //btn limpiar
        JButton btnclear = new JButton("CE");
        btnclear.setBounds(140, 210, 50, 30);
        //habilitar componentes
        this.getContentPane().add(lblnombre);
        this.getContentPane().add(lblres);
        this.getContentPane().add(lblop);
        this.getContentPane().add(txtnum);
        this.getContentPane().add(txtnum2);
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

        //escribir dependiendo de la txt seleccionada

        txtnum.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                selectedTextArea = txtnum;
            }
        });

        txtnum2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                selectedTextArea = txtnum2;
            }
        });

        //metodos de botones numericos

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedTextArea != null) {
                    selectedTextArea.append("1");
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedTextArea != null) {
                    selectedTextArea.append("2");
                }
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedTextArea != null) {
                    selectedTextArea.append("3");
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedTextArea != null) {
                    selectedTextArea.append("4");
                }
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedTextArea != null) {
                    selectedTextArea.append("5");
                }
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedTextArea != null) {
                    selectedTextArea.append("6");
                }
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedTextArea != null) {
                    selectedTextArea.append("7");
                }
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedTextArea != null) {
                    selectedTextArea.append("8");
                }
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedTextArea != null) {
                    selectedTextArea.append("9");
                }
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (selectedTextArea != null) {
                    selectedTextArea.append("0");
                }
            }
        });


        //metodos botones operacionales

        btnsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtnum.getText());
                double num2 = Double.parseDouble(txtnum2.getText());
                resultado = sumar(num1, num2);
                lblop.setText("+");
            }
        });

        btnres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtnum.getText());
                double num2 = Double.parseDouble(txtnum2.getText());
                resultado = restar(num1, num2);
                lblop.setText("+");
            }
        });

        btnequals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblres.setText("resultado:  " + resultado);
            }
        });

    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }
    public double multiplicar(double a, double b) {
        return a * b;
    }
}