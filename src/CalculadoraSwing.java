import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSwing extends JFrame{
    public JTextField primeiroNumero;

    public CalculadoraSwing() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.valueOf(primeiroNumero.getText());
                Double numero2 = Double.valueOf(segundoNumero.getText());

                Double somarValores = numero1 + numero2 ;

                resultado.setText(somarValores.toString());

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.valueOf(primeiroNumero.getText());
                Double numero2 = Double.valueOf(segundoNumero.getText());

                Double subtrairValores = numero1 - numero2 ;

                resultado.setText(subtrairValores.toString());

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.valueOf(primeiroNumero.getText());
                Double numero2 = Double.valueOf(segundoNumero.getText());

                Double dividirValores = numero1 / numero2 ;

                resultado.setText(dividirValores.toString());

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero1 = Double.valueOf(primeiroNumero.getText());
                Double numero2 = Double.valueOf(segundoNumero.getText());

                Double multiplicarValores = numero1 * numero2 ;

                resultado.setText(multiplicarValores.toString());

            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               primeiroNumero.setText("");
               segundoNumero.setText("");
               resultado.setText("");



            }
        });
    }

    public JTextField getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(JTextField primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public JTextField segundoNumero;
    public JButton button1;
    public JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton CEButton;
    private JTextField resultado;
    public JPanel calculadoraSwingg;




    }

