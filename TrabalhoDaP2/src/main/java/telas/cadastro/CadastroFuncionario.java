package telas.cadastro;

import javax.swing.*;

public class CadastroFuncionario extends JFrame {

    public void Configurar() {
        setTitle("Cadastro de Funcionários");
        setSize(800,700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public CadastroFuncionario() {
        Configurar();
    }
}
