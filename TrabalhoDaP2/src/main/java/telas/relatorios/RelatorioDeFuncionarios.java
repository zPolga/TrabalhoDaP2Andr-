package telas.relatorios;

import com.toedter.calendar.JDateChooser;
import telas.RelatoriosTelas.ListandoFuncionarios;

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
    private JDateChooser campoDtAdmissao;
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

    public JPanel getPainel() {
        return painel;
    }

    public void setPainel(JPanel painel) {
        this.painel = painel;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    public JLabel getNome() {
        return nome;
    }

    public void setNome(JLabel nome) {
        this.nome = nome;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public void setCampoNome(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    public JLabel getCpf() {
        return cpf;
    }

    public void setCpf(JLabel cpf) {
        this.cpf = cpf;
    }

    public JTextField getCampoCPF() {
        return campoCPF;
    }

    public void setCampoCPF(JTextField campoCPF) {
        this.campoCPF = campoCPF;
    }

    public JLabel getRg() {
        return rg;
    }

    public void setRg(JLabel rg) {
        this.rg = rg;
    }

    public JTextField getCampoRG() {
        return campoRG;
    }

    public void setCampoRG(JTextField campoRG) {
        this.campoRG = campoRG;
    }

    public JTextField getCampoDtNascimento() {
        return campoDtNascimento;
    }

    public void setCampoDtNascimento(JTextField campoDtNascimento) {
        this.campoDtNascimento = campoDtNascimento;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(JTextField campoEmail) {
        this.campoEmail = campoEmail;
    }

    public JLabel getEmail() {
        return email;
    }

    public void setEmail(JLabel email) {
        this.email = email;
    }

    public JLabel getdTadmissao() {
        return dTadmissao;
    }

    public void setdTadmissao(JLabel dTadmissao) {
        this.dTadmissao = dTadmissao;
    }

    public JTextField getCampoDtAdmissao() {
        return campoDtAdmissao;
    }

    public void setCampoDtAdmissao(JTextField campoDtAdmissao) {
        this.campoDtAdmissao = campoDtAdmissao;
    }

    public JTextField getCampoCargo() {
        return campoCargo;
    }

    public void setCampoCargo(JTextField campoCargo) {
        this.campoCargo = campoCargo;
    }

    public JLabel getCargo() {
        return cargo;
    }

    public void setCargo(JLabel cargo) {
        this.cargo = cargo;
    }

    public JLabel getFuncao() {
        return funcao;
    }

    public void setFuncao(JLabel funcao) {
        this.funcao = funcao;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JButton getBotaoRelatorio() {
        return botaoRelatorio;
    }

    public void setBotaoRelatorio(JButton botaoRelatorio) {
        this.botaoRelatorio = botaoRelatorio;
    }

    public RelatorioDeFuncionarios() {
        configurar();
        botaoRelatorio.addActionListener(e -> {
            new ListandoFuncionarios().setVisible(true);
        });

    }
}