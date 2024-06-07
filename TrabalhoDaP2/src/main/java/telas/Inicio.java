package telas;

import telas.cadastro.CadastroFuncionario;
import telas.cadastro.CadastroProduto;

import javax.swing.*;

public class Inicio  {
    private JPanel painelPrincipal;
    private JPanel botoes;
    private JPanel campos;
    private JPanel labels;
    private JButton entrar;
    private JButton cadastrar;
    private JLabel textoInicial;
    private JButton cadastrarFuncionario;

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


        cadastrar.addActionListener(e -> new CadastroProduto().setVisible(true));
        cadastrarFuncionario.addActionListener(e -> new CadastroFuncionario().setVisible(true));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Inicio inicio = new Inicio();
        });
    }

}
