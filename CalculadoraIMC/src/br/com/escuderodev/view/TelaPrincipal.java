package br.com.escuderodev.view;

import br.com.escuderodev.dto.CalculadoraIMC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    private JTextField txtPeso;
    private JTextField txtAltura;
    private JButton calcularButton;
    private JButton limparButton;
    public JPanel painelPrincipal;
    private JTextArea textAreaResultado;
    private JTextField txtResultado;
public TelaPrincipal() {
    calcularButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
            double peso = Double.parseDouble((txtPeso.getText()));
            double altura = Double.parseDouble(txtAltura.getText());

            String resultado = calculadoraIMC.calculaIMC(peso,altura);

            txtResultado.setText(resultado);
        }
    });
    limparButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            limpaCampos();
        }
    });
}
    private void limpaCampos() {
        txtPeso.setText("");
        txtAltura.setText("");
        txtResultado.setText("");
    }
}


