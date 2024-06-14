package telas.TelaInicial;

import entidades.Login;
import telas.Inicio;
import telas.cadastro.CadastroFuncionario;
import telas.login.TelaDeLogin;
import telas.login.TelaDeLoginJaCriado;

import javax.swing.*;

public class TelaDeInicio extends JFrame {
    private JButton entrarButton;
    private JButton cadastrarButton;
    private JPanel painel;

    public void Acoes(){
        entrarButton.addActionListener(e->new TelaDeLoginJaCriado().setVisible(true));
        cadastrarButton.addActionListener(e -> new CadastroFuncionario().setVisible(true));


    }
    public TelaDeInicio() {
        JFrame frame = new JFrame("Cadastro Material");
        frame.setContentPane(painel);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(800,700);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        Acoes();
    }
}
