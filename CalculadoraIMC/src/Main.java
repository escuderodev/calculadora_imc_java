import br.com.escuderodev.view.TelaPrincipal;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        TelaPrincipal tela = new TelaPrincipal();
        tela.setContentPane(tela.painelPrincipal);
        tela.setTitle("Calculadora de IMC");
        tela.setSize(470,350);
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}