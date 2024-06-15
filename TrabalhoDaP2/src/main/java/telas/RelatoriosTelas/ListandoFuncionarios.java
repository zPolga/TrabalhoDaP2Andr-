package telas.RelatoriosTelas;

import javax.swing.*;
import java.awt.*;

public class ListandoFuncionarios extends JFrame{
    private JTable nome;
    String []Colunas = {"ID","Nome","CPF","RG","Data de Nascimento","Sexo","Email","Data Admissão","Cargo","Função"};

    public void configurar() {
        setTitle("Relatório Funcionário");
        setSize(800, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public ListandoFuncionarios(){
        configurar();

    }
}