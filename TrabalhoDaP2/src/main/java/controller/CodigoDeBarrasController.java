package controller;

import dao.CodigoDeBarrasDao;
import dao.EstoqueDao;
import dao.TipoDao;
import entidades.CodigoDeBarras;
import entidades.Estoque;
import entidades.Funcionario;
import entidades.Tipo;
import telas.cadastro.Cadastro;
import util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.*;
import java.text.ParseException;

public class CodigoDeBarrasController {

    public void acoes(Cadastro cadastro) {

         cadastro.getBotaoSegundoCampo().addActionListener(e -> {
            String codigoDebarras = cadastro.getCodigoBarras().getText();
            String tipoCodBarras = cadastro.getTipoCodBarras().getName();
            String qtdPorCaixa = cadastro.getQtdPorCaixa().getText();
            Integer qtdPorCaixaFormatado = Integer.parseInt(qtdPorCaixa);
            Integer idCodVarras = Integer.parseInt(codigoDebarras);
            if (codigoDebarras.equals("") || tipoCodBarras.equals("") || qtdPorCaixa.equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            } else {

                Tipo tipo = new Tipo(tipoCodBarras);
                Estoque est = new Estoque(qtdPorCaixaFormatado);
                CodigoDeBarras codigoDeBarras = new CodigoDeBarras(idCodVarras, est, tipo);


                TipoDao tipoDao = new TipoDao();
                tipoDao.Cadastrar(tipo);
                EstoqueDao estoqueDao = new EstoqueDao();
                estoqueDao.Cadastrar(est);
                CodigoDeBarrasDao codigoDeBarrasDao = new CodigoDeBarrasDao();
                codigoDeBarrasDao.Cadastrar(codigoDeBarras);

                JOptionPane.showMessageDialog(null, "Gravado com sucesso!");


            }
        });

    }}
















