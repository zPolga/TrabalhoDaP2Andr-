package controller;

import dao.FuncionarioDao;
import entidades.Funcionario;
import telas.cadastro.CadastroFuncionario;
import telas.login.TelaDeLogin;
import telas.relatorios.RelatorioDeFuncionarios;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FuncionarioController {
    public void acoes(CadastroFuncionario funcionario) {
        funcionario.getBtmSalvar().addActionListener(e -> {
            String nome = funcionario.getCampoNome().getText();
            String cpf = funcionario.getCampoCpf().getText();
            String rg = funcionario.getRgcampo().getText();
            Date dataNascimento = funcionario.getDataChoser().getDate();
            Date dataAdmissao = funcionario.getDataChoser().getDate();
            SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");

            if (dataNascimento == null || dataAdmissao == null) {
                JOptionPane.showMessageDialog(null, "Formato de data inválido. Use dd/MM/yyyy.");
                return;
            }

            String sexo = (String) funcionario.getjComboBox().getSelectedItem();
            String email = funcionario.getCampoEmail().getText();
            String cargo = funcionario.getCampoCargo().getText();
            String funcao = funcionario.getCampoFuncao().getText();

            if (nome.isEmpty() || cpf.isEmpty() || rg.isEmpty() || sexo == null || email.isEmpty() || cargo.isEmpty() || funcao.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            } else {
                Funcionario funcionarioNovo = new Funcionario(nome, rg, cpf, dataNascimento, sexo, email, dataAdmissao, cargo, funcao);
                FuncionarioDao funcionarioDao = new FuncionarioDao();
                funcionarioDao.Cadastrar(funcionarioNovo);
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                new TelaDeLogin().setVisible(true);
            }
        });

    }

    public List<Funcionario> listarFuncionarios(String nome, String cpf, String rg, Date dataAdm, String sexo, String email, Date dataNasc, String cargo, String funcao) {
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        return funcionarioDao.listarFuncionario(nome, cpf, rg, dataAdm, sexo, email, dataNasc, cargo, funcao);
    }



    }

