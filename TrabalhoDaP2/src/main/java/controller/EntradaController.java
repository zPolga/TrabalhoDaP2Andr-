package controller;

import dao.CodigoDeBarrasDao;
import dao.EntradaDao;
import dao.NotaFiscalDao;
import dao.ProdutoDao;
import entidades.CodigoDeBarras;
import entidades.Entrada;
import entidades.NotaFiscal;
import entidades.Produto;
import telas.produtosEntrada.EntradaProduto;

import javax.swing.*;
import java.util.List;

public class EntradaController {

    public void acoes(EntradaProduto entradaProduto) {
        entradaProduto.getSalvarButton().addActionListener(e -> {
            String numeroDaNotaFiscal = entradaProduto.getNumeroNotaFiscalField().getText();
            String serieDaNotaFiscal = entradaProduto.getSerieNotaFiscalField().getText();
            String chaveNotaFiscal = entradaProduto.getChaveNotaFiscalField().getText();
            String tipoDaNotaFiscal = (String) entradaProduto.getTipoNotaFiscalComboBox().getSelectedItem();
            String codigoDeBarras = entradaProduto.getCodigoBarrasField().getText();

            try {
                if (numeroDaNotaFiscal.isEmpty() || serieDaNotaFiscal.isEmpty() || chaveNotaFiscal.isEmpty() || tipoDaNotaFiscal == null || codigoDeBarras.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                    return;
                }


                NotaFiscal notaFiscal = new NotaFiscal(serieDaNotaFiscal,chaveNotaFiscal, tipoDaNotaFiscal, serieDaNotaFiscal);
                Entrada entrada = new Entrada();
                entrada.adicionarNotaFiscal(notaFiscal);



                EntradaDao entradaDao = new EntradaDao();





               entradaDao.Cadastrar(entrada);

                JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao processar código de barras. Certifique-se de que seja um número válido.");
                ex.printStackTrace();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar entrada: " + ex.getMessage());
                ex.printStackTrace();
            }
        });
    }
}
