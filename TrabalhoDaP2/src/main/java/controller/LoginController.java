package controller;

import dao.LoginDao;
import entidades.Login;
import telas.Inicio;
import telas.TelaInicial.TelaDeInicio;
import telas.login.TelaDeLogin;
import telas.login.TelaDeLoginJaCriado;

import javax.swing.*;

public class LoginController {

    public void acoesLoginCriado(TelaDeLoginJaCriado loginJaCriado) {
        loginJaCriado.getLogar().addActionListener(e -> {
            String loginn = loginJaCriado.getCampoUsuario().getText();
            String senha = new String(loginJaCriado.getCampoSenha().getPassword());

            if (loginn.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            } else {
                LoginDao loginDao = new LoginDao();
                boolean autenticado = loginDao.autenticar(loginn, senha);

                if (autenticado) {
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                    new Inicio().setVisible(true);
                    loginJaCriado.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos.");
                }
            }
        });
    }

    public void acoes(TelaDeLogin login) {
        login.getCadastrarButton().addActionListener(e -> {
            String usuario = login.getCampoUsuario().getText();
            String senha = new String(login.getCampoSenha().getPassword());

            if (usuario.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            } else {
                Login loginNovo = new Login(usuario, senha);
                LoginDao loginDao = new LoginDao();
                loginDao.Cadastrar(loginNovo);
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

                new TelaDeLogin().setVisible(true);
                login.dispose();
            }
        });
    }
}
