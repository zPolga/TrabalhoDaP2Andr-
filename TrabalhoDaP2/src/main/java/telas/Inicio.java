package telas;

import controller.ProdutoController;
import telas.cadastro.Cadastro;

import javax.swing.*;

public class Inicio  {
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
        frame.setSize(800,700);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        acoes();
    }
    public void acoes() {


        cadastrar.addActionListener(e -> new Cadastro().setVisible(true));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Inicio inicio = new Inicio();
        });
    }

}
