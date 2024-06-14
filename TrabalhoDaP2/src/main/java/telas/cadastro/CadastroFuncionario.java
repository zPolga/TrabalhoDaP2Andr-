package telas.cadastro;

import com.toedter.calendar.JDateChooser;
import controller.FuncionarioController;

import javax.swing.*;
import java.awt.*;

public class CadastroFuncionario extends JFrame {
    private JLabel titulo;
    private JLabel primeiroSutitulo;
    private JPanel painel;
    private JLabel nome;
    private JTextField campoNome;
    private JPanel painelPrincipal;
    private JLabel cpf;
    private JLabel rg;
    private JTextField rgcampo;
    private JTextField campoCpf;
    private JLabel dataNascimento;
    private JDateChooser dataChoser;
    private JDateChooser dataChoserAdm;
    private JLabel sexo;
    private JLabel email;
    private JTextField campoEmail;
    private JLabel dataAdmissao;
    private JComboBox<String> jComboBox;
    private JLabel segundoTitulo;
    private JPanel painelDois;
    private JPanel segundoPainel;
    private JButton btmSalvar;
    private JPanel painelMain;
    private JLabel cargo;
    private JTextField campoCargo;
    private JTextField campoFuncao;
    private JLabel funcao;

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    public JLabel getPrimeiroSutitulo() {
        return primeiroSutitulo;
    }

    public void setPrimeiroSutitulo(JLabel primeiroSutitulo) {
        this.primeiroSutitulo = primeiroSutitulo;
    }

    public JPanel getPainel() {
        return painel;
    }

    public void setPainel(JPanel painel) {
        this.painel = painel;
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

    public JPanel getPainelPrincipal() {
        return painelPrincipal;
    }

    public void setPainelPrincipal(JPanel painelPrincipal) {
        this.painelPrincipal = painelPrincipal;
    }

    public JLabel getCpf() {
        return cpf;
    }

    public void setCpf(JLabel cpf) {
        this.cpf = cpf;
    }

    public JLabel getRg() {
        return rg;
    }

    public void setRg(JLabel rg) {
        this.rg = rg;
    }

    public JTextField getRgcampo() {
        return rgcampo;
    }

    public void setRgcampo(JTextField rgcampo) {
        this.rgcampo = rgcampo;
    }

    public JTextField getCampoCpf() {
        return campoCpf;
    }

    public void setCampoCpf(JTextField campoCpf) {
        this.campoCpf = campoCpf;
    }

    public JLabel getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(JLabel dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public JDateChooser getDataChoser() {
        return dataChoser;
    }

    public void setDataChoser(JDateChooser dataChoser) {
        this.dataChoser = dataChoser;
    }

    public JLabel getSexo() {
        return sexo;
    }

    public void setSexo(JLabel sexo) {
        this.sexo = sexo;
    }

    public JLabel getEmail() {
        return email;
    }

    public void setEmail(JLabel email) {
        this.email = email;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(JTextField campoEmail) {
        this.campoEmail = campoEmail;
    }

    public JLabel getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(JLabel dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public JComboBox<String> getjComboBox() {
        return jComboBox;
    }

    public void setjComboBox(JComboBox<String> jComboBox) {
        this.jComboBox = jComboBox;
    }

    public JLabel getSegundoTitulo() {
        return segundoTitulo;
    }

    public void setSegundoTitulo(JLabel segundoTitulo) {
        this.segundoTitulo = segundoTitulo;
    }

    public JPanel getPainelDois() {
        return painelDois;
    }

    public void setPainelDois(JPanel painelDois) {
        this.painelDois = painelDois;
    }

    public JPanel getSegundoPainel() {
        return segundoPainel;
    }

    public void setSegundoPainel(JPanel segundoPainel) {
        this.segundoPainel = segundoPainel;
    }

    public JButton getBtmSalvar() {
        return btmSalvar;
    }

    public void setBtmSalvar(JButton btmSalvar) {
        this.btmSalvar = btmSalvar;
    }

    public JPanel getPainelMain() {
        return painelMain;
    }

    public void setPainelMain(JPanel painelMain) {
        this.painelMain = painelMain;
    }

    public JLabel getCargo() {
        return cargo;
    }

    public void setCargo(JLabel cargo) {
        this.cargo = cargo;
    }

    public JTextField getCampoCargo() {
        return campoCargo;
    }

    public void setCampoCargo(JTextField campoCargo) {
        this.campoCargo = campoCargo;
    }

    public JTextField getCampoFuncao() {
        return campoFuncao;
    }

    public void setCampoFuncao(JTextField campoFuncao) {
        this.campoFuncao = campoFuncao;
    }

    public JLabel getFuncao() {
        return funcao;
    }

    public void setFuncao(JLabel funcao) {
        this.funcao = funcao;
    }

    public void Configurar() {
        setTitle("Cadastro de Funcionários");
        setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public CadastroFuncionario() {
        Configurar();
        Alocar();
        FuncionarioController funcionarioController = new FuncionarioController();
        funcionarioController.acoes(this);
    }

    public void Alocar() {
        setLayout(new BorderLayout());
        painelMain = new JPanel(new GridLayout(4, 2, 10, 10));
        painelPrincipal = new JPanel(new GridLayout(2, 2, 10, 10));
        painelDois = new JPanel(new GridLayout(4, 2, 10, 10));
        titulo = new JLabel("Cadastro de funcionário", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        primeiroSutitulo = new JLabel("Dados pessoais");
        nome = new JLabel("Nome:");
        rg = new JLabel("RG");
        rgcampo = new JTextField(30);
        primeiroSutitulo.setFont(new Font("Arial", Font.BOLD, 16));

        painel = new JPanel(new GridLayout(6, 2, 10, 10));
        campoNome = new JTextField(30);
        cpf = new JLabel("CPF");
        campoCpf = new JTextField(30);

        dataNascimento = new JLabel("Data de nascimento");
        dataChoser = new JDateChooser();
        dataChoser.setDateFormatString("dd/MM/yyyy");

        painelPrincipal.add(titulo);
        painelPrincipal.add(primeiroSutitulo);
        painelMain.add(painelPrincipal);
        painel.add(nome);
        painel.add(campoNome);
        painel.add(cpf);
        painel.add(campoCpf);
        painel.add(rg);
        painel.add(rgcampo);
        painel.add(dataNascimento);
        painel.add(dataChoser);

        String[] options = {"M", "F"};
        jComboBox = new JComboBox<>(options);
        sexo = new JLabel("Sexo");
        email = new JLabel("E-mail");
        campoEmail = new JTextField(30);
        painel.add(sexo);
        painel.add(jComboBox);
        painel.add(email);
        painel.add(campoEmail);
        painelMain.add(painel);
        segundoPainel = new JPanel(new GridLayout(1, 1));
        segundoTitulo = new JLabel("Dados profissionais");
        segundoTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        segundoPainel.add(segundoTitulo);
        painelMain.add(segundoPainel);

        dataAdmissao = new JLabel("Data de Admissão");
        dataChoserAdm = new JDateChooser();
        dataChoserAdm.setDateFormatString("dd/MM/yyyy");
        btmSalvar = new JButton("Salvar");

        btmSalvar.setBackground(Color.GREEN);
        btmSalvar.setForeground(Color.BLACK);
        btmSalvar.setOpaque(true);
        cargo = new JLabel("Cargo");
        funcao = new JLabel("Função");
        campoCargo = new JTextField(30);
        campoFuncao = new JTextField(30);
        painelDois.add(dataAdmissao);
        painelDois.add(dataChoserAdm);
        painelDois.add(cargo);
        painelDois.add(campoCargo);
        painelDois.add(funcao);
        painelDois.add(campoFuncao);
        painelDois.add(btmSalvar);

        painelMain.add(painelDois);

        add(painelMain);
    }
}
