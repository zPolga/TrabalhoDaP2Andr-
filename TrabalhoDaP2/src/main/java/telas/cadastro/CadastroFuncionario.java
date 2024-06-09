package telas.cadastro;


import javax.swing.*;
import java.awt.*;
import java.util.Properties;
import com.toedter.calendar.JDateChooser;


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
    private JTextField campoData;
    private JLabel sexo;
    private JLabel email;
    private JTextField campoEmail;

    private JLabel dataAdmissao;
    private JComboBox<String>jComboBox;
    private JLabel segundoTitulo;
    private JTextField campoDataAdm;
    private JPanel painelDois;
    private JPanel segundoPainel;
    private JButton btmSalvar;
    private JPanel painelMain;

    private JLabel cargo;
    private JTextField campoCargo;
    private JTextField campoFuncao;
    private JLabel funcao;
    public  void Configurar() {
        setTitle("Cadastro de Funcionários");
        setSize(800,600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public CadastroFuncionario() {
        Configurar();
        Alocar();
    }
    public  void Alocar() {
        setLayout(new BorderLayout());
        painelMain = new JPanel(new GridLayout(4,2,10,10));
        painelPrincipal = new JPanel(new GridLayout(2,2,10,10));
        painelDois = new JPanel(new GridLayout(4,2,10,10));
        titulo = new JLabel("Cadastro de funcionário",SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        primeiroSutitulo = new JLabel("Dados pessoais");
        nome = new JLabel("Nome:");
        rg = new JLabel("RG");
        rgcampo = new JTextField(30);
        primeiroSutitulo.setFont(new Font("Arial",Font.BOLD, 16));

        painel = new JPanel(new GridLayout(6,2,10,10));
        campoNome = new JTextField(30);
        cpf = new JLabel("CPF");
        campoCpf = new JTextField(30);

        dataNascimento =  new JLabel("Data de nascimento");
        campoData = new JTextField(30);
        dataChoser = new JDateChooser();


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
        String [] options = {"M","F"};
        jComboBox = new JComboBox<>(options);
        sexo = new JLabel("Sexo");
        email = new JLabel("E-mail");
        campoEmail = new JTextField(30);
        painel.add(sexo);
        painel.add(jComboBox);
        painel.add(email);
        painel.add(campoEmail);
        painelMain.add(painel);
        segundoPainel = new JPanel(new GridLayout(1,1));
        segundoTitulo = new JLabel("Dados profissionais");
        segundoTitulo.setFont(new Font("Arial",Font.BOLD,16));
        segundoPainel.add(segundoTitulo);
        painelMain.add(segundoPainel);
        dataAdmissao = new JLabel("Data de Admissão");
        campoDataAdm = new JTextField(30);
        dataChoserAdm = new JDateChooser();
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
