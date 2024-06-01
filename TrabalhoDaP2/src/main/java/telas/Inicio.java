package telas;

import javax.swing.*;

public class Inicio {
    private JPanel painelPrincipal;
    private JPanel botoes;
    private JPanel campos;
    private JPanel labels;
    private JButton entrar;
    private JButton cadastrar;
    private JLabel textoInicial;
    public Inicio() {
        JFrame frame = new JFrame("Cadastro Material");
        frame.setContentPane(painelPrincipal);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(600,500);
        frame.setVisible(true);
    }
}
