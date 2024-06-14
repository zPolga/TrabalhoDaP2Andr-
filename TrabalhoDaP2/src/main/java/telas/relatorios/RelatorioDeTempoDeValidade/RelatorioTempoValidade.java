package telas.relatorios.RelatorioDeTempoDeValidade;

import javax.swing.*;

public class RelatorioTempoValidade extends JFrame{
    private JPanel painel;
    private JLabel titulo;
    private JLabel codigoDeBarras;
    private JTextField campoId;
    private JTextField campoCodigo;
    private JLabel tempoValidade;
    private JTextField campoValidade;
    private JLabel dataVencimento;
    private JTextField campoVencimento;
    private JButton botaoGerarRelatorio;
    public void configurar() {
        setTitle("Relatório");
        setContentPane(painel);
        setSize(800, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public RelatorioTempoValidade(){
        configurar();
    }
}
