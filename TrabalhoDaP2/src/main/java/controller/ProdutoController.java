package controller;

import dao.ProdutoDao;
import entidades.Produto;
import telas.Inicio;
import telas.cadastro.CadastroProduto;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoController  {


    public void acoes(CadastroProduto cadastro) {
        cadastro.getSalvarPrimeiroCampo().addActionListener(e -> {
            String marca = cadastro.getMarca().getText();
            String categoria = cadastro.getCategoria().getText();
            String fornecedor = cadastro.getFornecedor().getText();
            String precoProd =cadastro.getPrecoProd().getText();
            double precoProdConvertido = Double.parseDouble(precoProd);
            try {
                String dataValidade = cadastro.getTempoValidade().getText();
                SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
                Date dataConvertida = formatar.parse(dataValidade);
                String precoVenda = cadastro.getPrecoVend().getText();
                double precoVendaFormatado = Double.parseDouble(precoVenda);
                String qtdRecebida = cadastro.getQtdRecebida().getText();
                double qtdRecebidaFormatada = Double.parseDouble(qtdRecebida);
                String qtdMinimaEstoque = cadastro.getQtdMinimaRecebida().getText();
                double QtdMinimaEstoqueFormatada = Double.parseDouble(qtdMinimaEstoque);
                if (marca.equals("") || categoria.equals("") || fornecedor.equals("") || precoProd.equals("") || dataValidade.equals("") || precoProd.equals("") || qtdRecebida.equals("") || precoVenda.equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");

                }else{


                        Produto produto = new Produto(marca, categoria,fornecedor, qtdRecebidaFormatada,precoProdConvertido, precoVendaFormatado, dataConvertida, QtdMinimaEstoqueFormatada);



                            ProdutoDao produtoDao = new ProdutoDao();
                            produtoDao.Cadastrar(produto);

                            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");


                    }

                } catch (ParseException exception) {
                    exception.printStackTrace();
                }

            });
        }


    public static void main(String[] args) {
        Inicio inicio = new Inicio();


    }
}