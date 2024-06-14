package telas.relatorios;

import telas.relatorios.RelatorioDeFuncionarios;

import javax.swing.*;

public class RelatorioDeProdutos extends JFrame{
    private JPanel painel;
    private JLabel titulo;
    private JLabel fornecedor;
    private JTextField textField1;
    private JLabel notaFiscal;
    private JTextField campoNotaFiscal;
    private JTextField campoDtEntrada;
    private JTextField campoLcDestino;
    private JLabel codigoDeBarrasNota;
    private JTextField campoCdBarrasNota;
    private JLabel idProduto;
    private JTextField campoId;
    private JButton gerarRelatórioButton;
    public void configurar() {
        setTitle("Relatório");
        setContentPane(painel);
        setSize(800, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public RelatorioDeProdutos(){
        configurar();
    }
}
