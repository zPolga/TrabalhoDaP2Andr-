package telas.produtosEntrada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntradaProduto extends JFrame {

    public EntradaProduto() {
        configurar();
        criarTela();
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
        panel.add(criarCampo("Número da Nota Fiscal:"), gbc);

        gbc.gridy++;
        panel.add(criarCampo("Série da Nota Fiscal:"), gbc);

        gbc.gridy++;
        panel.add(criarCampo("Chave da Nota Fiscal:"), gbc);

        gbc.gridy++;
        panel.add(criarCampoComboBox("Tipo de Nota Fiscal:", new JComboBox<>(new String[]{"NF-e", "NFS-e", "CT-e", "Outro"})), gbc);

        gbc.gridy++;
        panel.add(criarCampo("Código de Barras do Produto:"), gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(criarBotao("Salvar"), gbc);

        gbc.gridy++;
        panel.add(criarBotao("Fechar"), gbc);

        add(panel);
    }

    private JPanel criarCampo(String label) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel labelCampo = new JLabel(label);
        JTextField textFieldCampo = new JTextField(15);
        textFieldCampo.setPreferredSize(new Dimension(200, 30)); // Definindo tamanho preferido
        panel.add(labelCampo, BorderLayout.NORTH);
        panel.add(textFieldCampo, BorderLayout.CENTER);
        return panel;
    }

    private JPanel criarCampoComboBox(String label, JComboBox<String> comboBox) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel labelCampo = new JLabel(label);
        panel.add(labelCampo, BorderLayout.NORTH);
        panel.add(comboBox, BorderLayout.CENTER);
        return panel;
    }

    private JButton criarBotao(String texto) {
        JButton button = new JButton(texto);
        button.setPreferredSize(new Dimension(200, 30)); // Definindo tamanho preferido
        return button;

    }
}
