package telas.relatorios.RelatorioDeSaidaDeProdutos;

import javax.swing.*;

public class RelatorioSaidaProdutos extends JFrame{
    private JPanel painel;
    private JLabel idProduto;
    private JTextField campoId;
    private JLabel notaFiscalSaida;
    private JTextField campoNotaFiscalSaida;
    private JLabel titulo;
    private JTextField campoNota;
    private JLabel tipoSaida;
    private JTextField campoTipoSaida;
    private JLabel qtdProdutos;
    private JTextField campoQtdProdutos;
    private JButton gerarRelatórioButton;
    public void configurar() {
        setTitle("Relatório");
        setContentPane(painel);
        setSize(800, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public RelatorioSaidaProdutos(){
        configurar();
    }
}
