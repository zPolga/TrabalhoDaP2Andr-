package telas.TelasDeGeracaoDeRelatorio;

import javax.swing.*;
import java.awt.*;

public class TelasGeracaoRelatórios {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Entrada de Produtos");
        frame.setSize(500, 500);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,1));
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));

        JLabel título = new JLabel("Saída de Produtos");
        título.setFont(new Font("Arial", Font.BOLD, 22));
        frame.add(panel2);
        panel.add(panel2);
        panel2.add(título);

        JLabel labelNotaFiscalSaida = new JLabel("Nota Fiscal de Saída:");
        JTextField textFieldNotaFiscalSaida = new JTextField();
        panel.add(labelNotaFiscalSaida);
        panel.add(textFieldNotaFiscalSaida);

        JLabel labelIDProduto = new JLabel("ID do Produto:");
        JTextField textFieldIDProduto = new JTextField();
        panel.add(labelIDProduto);
        panel.add(textFieldIDProduto);

        JLabel labelCodigoBarras = new JLabel("Código de Barras do Produto:");
        JTextField textFieldCodigoBarras = new JTextField();
        panel.add(labelCodigoBarras);
        panel.add(textFieldCodigoBarras);

        JLabel labelTipoSaida = new JLabel("Tipo de Saída:");
        String[] tiposSaida = {"Saída 1", "Saída 2", "Saída 3", "Outro"};
        JComboBox comboBoxTipoSaida = new JComboBox(tiposSaida);
        panel.add(labelTipoSaida);
        panel.add(comboBoxTipoSaida);

        JLabel labelQuantidadeProdutos = new JLabel("Quantidade de Produtos:");
        JTextField textFieldQuantidadeProdutos = new JTextField();
        panel.add(labelQuantidadeProdutos);
        panel.add(textFieldQuantidadeProdutos);

        JButton buttonSalvar = new JButton("Salvar");
        panel.add(buttonSalvar);

        frame.add(panel);
        frame.setVisible(true);
    }
}