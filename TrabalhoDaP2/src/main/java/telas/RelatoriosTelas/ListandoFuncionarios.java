package telas.RelatoriosTelas;

import controller.FuncionarioController;
import entidades.Funcionario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ListandoFuncionarios extends JFrame {
    private JTable funcionarioTable;
    private JScrollPane tableScrollPane;
    private FuncionarioController funcionarioController;
    private JScrollPane NomeColunas;
    private JTable nomeTable;

    public ListandoFuncionarios(String nome, String cpf, String rg, Date dataAdm, String sexo, String email, Date dataNasc, String cargo, String funcao) {
        configurar(nome, cpf, rg, dataAdm, sexo, email, dataNasc, cargo, funcao);
    }

    public void configurar(String nome, String cpf, String rg, Date dataAdm, String sexo, String email, Date dataNasc, String cargo, String funcao) {
        String[] colunas = {"ID", "Nome Completo", "CPF", "RG", "Data de Nascimento", "Sexo", "Email", "Data de Admissão", "Cargo", "Função"};
        setTitle("Relatório de Funcionários");
        funcionarioController = new FuncionarioController();
        setSize(800, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        DefaultTableModel model = new DefaultTableModel(colunas, 0);
        funcionarioTable = new JTable(model);
        tableScrollPane = new JScrollPane(funcionarioTable);
        add(tableScrollPane, BorderLayout.CENTER);

        listarFuncionarios(nome, cpf, rg, dataAdm, sexo, email, dataNasc, cargo, funcao);
    }

    private void listarFuncionarios(String nome, String cpf, String rg, Date dataAdm, String sexo, String email, Date dataNasc, String cargo, String funcao) {
        System.out.println("Listar Funcionarios - Filtros:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data Admissão: " + dataAdm);
        System.out.println("Sexo: " + sexo);
        System.out.println("Email: " + email);
        System.out.println("Data Nascimento: " + dataNasc);
        System.out.println("Cargo: " + cargo);
        System.out.println("Função: " + funcao);

        List<Funcionario> funcionarios = funcionarioController.listarFuncionarios(nome, cpf, rg, dataAdm, sexo, email, dataNasc, cargo, funcao);
        DefaultTableModel model = (DefaultTableModel) funcionarioTable.getModel();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        model.setRowCount(0); // Limpar tabela antes de adicionar novos dados

        for (Funcionario funcionario : funcionarios) {
            Object[] rowData = {
                    funcionario.getId(),
                    funcionario.getNomeCompleto(),
                    funcionario.getCPF(),
                    funcionario.getRg(),
                    dateFormat.format(funcionario.getDtnascimento()),
                    funcionario.getSexo(),
                    funcionario.getEmail(),
                    dateFormat.format(funcionario.getDataAdmissao()),
                    funcionario.getCargo(),
                    funcionario.getFuncao()
            };
            model.addRow(rowData);
        }
    }
}
