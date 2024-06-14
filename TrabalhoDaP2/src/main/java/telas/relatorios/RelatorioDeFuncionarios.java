package telas.relatorios;

import javax.swing.*;

public class RelatorioDeFuncionarios extends JFrame{
    private JPanel painel;
    private JLabel titulo;
    private JLabel nome;
    private JTextField campoNome;
    private JLabel cpf;
    private JTextField campoCPF;
    private JLabel rg;
    private JTextField campoRG;
    private JTextField campoDtNascimento;
    private JComboBox comboBox1;
    private JTextField campoEmail;
    private JLabel email;
    private JLabel dTadmissao;
    private JTextField campoDtAdmissao;
    private JTextField campoCargo;
    private JLabel cargo;
    private JLabel funcao;
    private JTextField textField1;
    private JButton botaoRelatorio;
    public void configurar() {
        setTitle("Relatório ");
        setContentPane(painel);
        setSize(800, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public RelatorioDeFuncionarios() {
        configurar();

    }
}
