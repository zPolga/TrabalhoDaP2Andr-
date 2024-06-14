package telas;

import telas.ProdutosSaida.SaidaProdutos;
import telas.TelaInicial.TelaDeInicio;
import telas.cadastro.CadastroFuncionario;
import telas.cadastro.CadastroProduto;
import telas.produtosEntrada.EntradaProduto;
import telas.relatorios.RelatorioDeProdutos;
import telas.relatorios.RelatorioDeSaidaDeProdutos.RelatorioSaidaProdutos;
import telas.relatorios.RelatorioDeTempoDeValidade.RelatorioTempoValidade;
import telas.relatorios.RelatorioDeFuncionarios;

import javax.swing.*;

public class Inicio extends JFrame {
    private JPanel painelPrincipal;
    private JPanel botoes;
    private JPanel campos;
    private JPanel labels;
    private JButton relatorios;
    private JButton cadastrar;
    private JLabel textoInicial;
    private JButton entradaDeProdutos;
    private JButton saidaProdutos;
    private JButton gerarRelatóriosDeEntradaButton;
    private JButton gerarRelatórioDeTempoButton;
    private JButton gerarRelatórioDeSaídaButton;


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
        saidaProdutos.addActionListener(e -> new SaidaProdutos().setVisible(true));
        entradaDeProdutos.addActionListener(e -> new EntradaProduto().setVisible(true));
        cadastrar.addActionListener(e -> new CadastroProduto().setVisible(true));
        relatorios.addActionListener(e -> new RelatorioDeFuncionarios().setVisible(true));
        gerarRelatóriosDeEntradaButton.addActionListener(e -> new RelatorioDeProdutos().setVisible(true));
        gerarRelatórioDeTempoButton.addActionListener(e -> new RelatorioTempoValidade().setVisible(true));
        gerarRelatórioDeSaídaButton.addActionListener(e -> new RelatorioSaidaProdutos().setVisible(true));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaDeInicio inicio = new TelaDeInicio();
        });
    }

}
