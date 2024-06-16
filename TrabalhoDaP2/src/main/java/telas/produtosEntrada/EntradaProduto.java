package telas.produtosEntrada;

import controller.EntradaController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntradaProduto extends JFrame {

    private JTextField numeroNotaFiscalField;
    private JTextField serieNotaFiscalField;
    private JTextField chaveNotaFiscalField;
    private JComboBox<String> tipoNotaFiscalComboBox;
    private JTextField codigoBarrasField;
    private JButton salvarButton;
    private JButton fecharButton;

    public EntradaProduto() {
        configurar();
        criarTela();
        EntradaController entradaController = new EntradaController();
        entradaController.acoes(this);
    }

    public void configurar() {
        setTitle("Cadastro de Produto");
        setSize(800, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void criarTela() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel titulo = new JLabel("Entrada de Produtos", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        panel.add(titulo, gbc);

        gbc.gridy++;
        panel.add(criarCampo("Número da Nota Fiscal:", getNumeroNotaFiscalField()), gbc);

        gbc.gridy++;
        panel.add(criarCampo("Série da Nota Fiscal:", getSerieNotaFiscalField()), gbc);

        gbc.gridy++;
        panel.add(criarCampo("Chave da Nota Fiscal:", getChaveNotaFiscalField()), gbc);

        gbc.gridy++;
        panel.add(criarCampoComboBox("Tipo de Nota Fiscal:", getTipoNotaFiscalComboBox()), gbc);

        gbc.gridy++;
        panel.add(criarCampo("Código de Barras do Produto:", getCodigoBarrasField()), gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(getSalvarButton(), gbc);

        gbc.gridy++;
        panel.add(getFecharButton(), gbc);

        add(panel);
    }

    private JPanel criarCampo(String label, JTextField textField) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel labelCampo = new JLabel(label);
        textField.setPreferredSize(new Dimension(200, 30)); // Definindo tamanho preferido
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

    public JTextField getNumeroNotaFiscalField() {
        if (numeroNotaFiscalField == null) {
            numeroNotaFiscalField = new JTextField(15);
        }
        return numeroNotaFiscalField;
    }

    public JTextField getSerieNotaFiscalField() {
        if (serieNotaFiscalField == null) {
            serieNotaFiscalField = new JTextField(15);
        }
        return serieNotaFiscalField;
    }

    public JTextField getChaveNotaFiscalField() {
        if (chaveNotaFiscalField == null) {
            chaveNotaFiscalField = new JTextField(15);
        }
        return chaveNotaFiscalField;
    }

    public JComboBox<String> getTipoNotaFiscalComboBox() {
        if (tipoNotaFiscalComboBox == null) {
            tipoNotaFiscalComboBox = new JComboBox<>(new String[]{"NF-e", "NFS-e", "CT-e", "Outro"});
        }
        return tipoNotaFiscalComboBox;
    }

    public JTextField getCodigoBarrasField() {
        if (codigoBarrasField == null) {
            codigoBarrasField = new JTextField(15);
        }
        return codigoBarrasField;
    }

    public JButton getSalvarButton() {
        if (salvarButton == null) {
            salvarButton = new JButton("Salvar");
            salvarButton.setPreferredSize(new Dimension(200, 30));

        }
        return salvarButton;
    }

    public JButton getFecharButton() {
        if (fecharButton == null) {
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
            new EntradaProduto().setVisible(true);
        });
    }
}
