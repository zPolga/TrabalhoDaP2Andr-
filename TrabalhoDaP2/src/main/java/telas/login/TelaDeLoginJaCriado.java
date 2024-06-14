package telas.login;

import controller.LoginController;

import javax.swing.*;

public class TelaDeLoginJaCriado extends JFrame {
    private JPanel painel;
    private JLabel usuario;
    private JPasswordField campoSenha;
    private JTextField campoUsuario;
    private JLabel Sen;
    private JButton logar;

    public JPanel getPainel() {
        return painel;
    }

    public void setPainel(JPanel painel) {
        this.painel = painel;
    }

    public JLabel getUsuario() {
        return usuario;
    }

    public void setUsuario(JLabel usuario) {
        this.usuario = usuario;
    }

    public JPasswordField getCampoSenha() {
        return campoSenha;
    }

    public void setCampoSenha(JPasswordField campoSenha) {
        this.campoSenha = campoSenha;
    }

    public JTextField getCampoUsuario() {
        return campoUsuario;
    }

    public void setCampoUsuario(JTextField campoUsuario) {
        this.campoUsuario = campoUsuario;
    }

    public JLabel getCampoSen() {
        return Sen;
    }

    public void setCampoSen(JLabel campoSen) {
        this.Sen = campoSen;
    }

    public JButton getLogar() {
        return logar;
    }

    public void setLogar(JButton logar) {
        this.logar = logar;
    }

    public TelaDeLoginJaCriado() {

        setContentPane(painel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(800, 700);
        setVisible(true);
        setLocationRelativeTo(null);
        LoginController loginController = new LoginController();
        loginController.acoesLoginCriado(this);
    }
}
