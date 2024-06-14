package telas.login;

import controller.LoginController;
import telas.TelaInicial.TelaDeInicio;

import javax.swing.*;

public class TelaDeLogin extends JFrame {
    private JPanel painel;
    private JLabel titulo;
    private JLabel usuario;
    private JTextField campoUsuario;
    private JLabel senha;
    private JPasswordField campoSenha;
    private JButton cadastrarButton;
    public TelaDeLogin() {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(painel);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(800,700);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        LoginController loginController = new LoginController();
        loginController.acoes(this);

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

    public JLabel getUsuario() {
        return usuario;
    }

    public void setUsuario(JLabel usuario) {
        this.usuario = usuario;
    }

    public JTextField getCampoUsuario() {
        return campoUsuario;
    }

    public void setCampoUsuario(JTextField campoUsuario) {
        this.campoUsuario = campoUsuario;
    }

    public JLabel getSenha() {
        return senha;
    }

    public void setSenha(JLabel senha) {
        this.senha = senha;
    }

    public JPasswordField getCampoSenha() {
        return campoSenha;
    }

    public void setCampoSenha(JPasswordField campoSenha) {
        this.campoSenha = campoSenha;
    }

    public JButton getCadastrarButton() {
        return cadastrarButton;
    }

    public void setCadastrarButton(JButton cadastrarButton) {
        this.cadastrarButton = cadastrarButton;
    }
}
