package telas.RelatoriosTelas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ListandoFuncionarios extends JFrame{
    private JTable nomeTable;
    private JScrollPane NomeColunas;

    public void configurar() {
        String []Colunas = {"ID","Nome","CPF","RG","Data de Nascimento","Sexo","Email","Data Admissão","Cargo","Função"};
        setTitle("Relatório Funcionário");
        setSize(800, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        Object[][] Linhas = {{"190","AdrianP","123","321","12/12/2112","M","adrian@gmail.com","12/12/2112","Developer","Developar"},{"190","AdrianP","123","321","12/12/2112","M","adrian@gmail.com","12/12/2112","Developer","Developar"}};
        DefaultTableModel colunas = new DefaultTableModel(Linhas,Colunas);
        nomeTable = new JTable(colunas);
         NomeColunas = new JScrollPane(nomeTable);
        getContentPane().add(NomeColunas, BorderLayout.CENTER);
        add(nomeTable);



    }

    public ListandoFuncionarios(){
        configurar();

    }
}