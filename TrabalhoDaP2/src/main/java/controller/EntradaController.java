package controller;

import telas.produtosEntrada.EntradaProduto;

import javax.swing.*;

public class EntradaController {

    public void acoes(EntradaProduto entradaProduto) {
        entradaProduto.getSalvarButton().addActionListener(e -> {
            String numeroDaNotaFiscal = entradaProduto.getNumeroNotaFiscalField().getText();
            String serieDaNotaFiscal = entradaProduto.getSerieNotaFiscalField().getText();
            String chaveNotaFiscal = entradaProduto.getChaveNotaFiscalField().getText();
            String tipoDaNotaFiscal = (String) entradaProduto.getTipoNotaFiscalComboBox().getSelectedItem();
            String codigoDeBarras = entradaProduto.getCodigoBarrasField().getText();
            Integer idCodigoDeBarras = Integer.parseInt(codigoDeBarras);
            if(numeroDaNotaFiscal.equals("") || serieDaNotaFiscal.equals("") || chaveNotaFiscal.equals("") || tipoDaNotaFiscal.equals("")){

                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");


            }else{

            }
        });
    }
}
