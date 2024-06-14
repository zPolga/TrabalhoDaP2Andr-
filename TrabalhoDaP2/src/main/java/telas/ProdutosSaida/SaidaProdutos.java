package telas.ProdutosSaida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaidaProdutos extends JFrame {

    private JTextField notaFiscalField;
    private JTextField idProdutoField;
    private JTextField codigoBarrasField;
    private JComboBox<String> tipoSaidaComboBox;
    private JTextField quantidadeField;
    private JButton salvarButton;

    private JButton fecharButton;

    public SaidaProdutos() {
        configurar();
        criarTela();
    }

    public void configurar() {
        setTitle("Saída de Produtos");
        setSize(800, 700); // Alterado para 600x800
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void criarTela() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel titulo = new JLabel("Saída de Produtos", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        panel.add(titulo, gbc);

        gbc.gridy++;
        panel.add(criarCampo("Nota Fiscal de Saída:", getNotaFiscalField()), gbc);

        gbc.gridy++;
        panel.add(criarCampo("ID do Produto:", getIdProdutoField()), gbc);

        gbc.gridy++;
        panel.add(criarCampo("Código de Barras do Produto:", getCodigoBarrasField()), gbc);

        gbc.gridy++;
        panel.add(criarCampoComboBox("Tipo de Saída:", getTipoSaidaComboBox()), gbc);

        gbc.gridy++;
        panel.add(criarCampo("Quantidade de Produtos:", getQuantidadeField()), gbc);

        gbc.gridy++;
        panel.add(getSalvarButton(), gbc);
        gbc.gridy++;

        panel.add(getFecharButton(), gbc);
        add(panel);
    }

    private JPanel criarCampo(String label, JTextField textField) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel labelCampo = new JLabel(label);
        textField.setPreferredSize(new Dimension(200, 30));
        panel.add(labelCampo, BorderLayout.NORTH);
        panel.add(textField, BorderLayout.CENTER);
        return panel;
    }

    private JPanel criarCampoComboBox(String label, JComboBox<String> comboBox) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel labelCampo = new JLabel(label);
        panel.add(labelCampo, BorderLayout.NORTH);
        panel.add(comboBox, BorderLayout.CENTER);
        return panel;
    }

    public JTextField getNotaFiscalField() {
        if (notaFiscalField == null) {
            notaFiscalField = new JTextField(15);
        }
        return notaFiscalField;
    }

    public JTextField getIdProdutoField() {
        if (idProdutoField == null) {
            idProdutoField = new JTextField(15);
        }
        return idProdutoField;
    }

    public JTextField getCodigoBarrasField() {
        if (codigoBarrasField == null) {
            codigoBarrasField = new JTextField(15);
        }
        return codigoBarrasField;
    }

    public JComboBox<String> getTipoSaidaComboBox() {
        if (tipoSaidaComboBox == null) {
            tipoSaidaComboBox = new JComboBox<>(new String[]{"Saída 1", "Saída 2", "Saída 3", "Outro"});
        }
        return tipoSaidaComboBox;
    }

    public JTextField getQuantidadeField() {
        if (quantidadeField == null) {
            quantidadeField = new JTextField(15);
        }
        return quantidadeField;
    }

    public JButton getSalvarButton() {
        if (salvarButton == null) {
            salvarButton = new JButton("Salvar");
            salvarButton.setPreferredSize(new Dimension(200, 30));


        }
        return salvarButton;
    }
    public JButton getFecharButton(){
        if(fecharButton == null) {
            fecharButton = new JButton("Fechar");
            fecharButton.setPreferredSize(new Dimension(200, 30));
            fecharButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == fecharButton) {
                        dispose();
                    }
                }
            });

        }
        return fecharButton;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SaidaProdutos().setVisible(true);
        });
    }
}
