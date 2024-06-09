package telas.produtosEntrada;

import javax.swing.*;
import java.awt.*;

public class EntradaProduto {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Entrada de Produtos");
        frame.setSize(500, 500);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,1));
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2));

        JLabel título = new JLabel("Entrada de Produtos");
        título.setFont(new Font("Arial", Font.BOLD, 22));
        frame.add(panel2);
        panel.add(panel2);
        panel2.add(título);

        JLabel labelCodigoBarras = new JLabel("Código de Barras do Produto:");
        JTextField textFieldCodigoBarras = new JTextField();
        panel.add(labelCodigoBarras);
        panel.add(textFieldCodigoBarras);

        JLabel labelNotaFiscalNumero = new JLabel("Número da Nota Fiscal:");
        JTextField textFieldNotaFiscalNumero = new JTextField();
        panel.add(labelNotaFiscalNumero);
        panel.add(textFieldNotaFiscalNumero);

        JLabel labelNotaFiscalSerie = new JLabel("Série da Nota Fiscal:");
        JTextField textFieldNotaFiscalSerie = new JTextField();
        panel.add(labelNotaFiscalSerie);
        panel.add(textFieldNotaFiscalSerie);

        JLabel labelNotaFiscalChave = new JLabel("Chave da Nota Fiscal:");
        JTextField textFieldNotaFiscalChave = new JTextField();
        panel.add(labelNotaFiscalChave);
        panel.add(textFieldNotaFiscalChave);

        JLabel labelNotaFiscalTipo = new JLabel("Tipo de Nota Fiscal:");
        String[] tiposNotaFiscal = {"NF-e", "NFS-e", "CT-e", "Outro"};
        JComboBox comboBoxNotaFiscalTipo = new JComboBox(tiposNotaFiscal);
        panel.add(labelNotaFiscalTipo);
        panel.add(comboBoxNotaFiscalTipo);

        JButton buttonSalvar = new JButton("Salvar");
        panel.add(buttonSalvar);

        frame.add(panel);
        frame.setVisible(true);
    }
}