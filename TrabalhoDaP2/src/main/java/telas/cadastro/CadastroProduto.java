package telas.cadastro;

import controller.CodigoDeBarrasController;
import controller.ProdutoController;

import javax.swing.*;
import java.awt.*;

public class CadastroProduto extends JFrame {
    private JTextField marca;
    private JLabel titulo;
    private JTextField categoria;
    private JPanel campo;
    private JTextField fornecedor;
    private JTextField precoProd;
    private JTextField precoVend;
    private JTextField tempoValidade;

    public void setMarca(JTextField marca) {
        this.marca = marca;
    }

    public JTextField getMarca() {
        return marca;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    public JTextField getCategoria() {
        return categoria;
    }

    public JPanel getCampo() {
        return campo;
    }

    public void setCampo(JPanel campo) {
        this.campo = campo;
    }

    public JTextField getFornecedor() {
        return fornecedor;
    }

    public JTextField getPrecoProd() {
        return precoProd;
    }

    public JTextField getPrecoVend() {
        return precoVend;
    }

    public JTextField getTempoValidade() {
        return tempoValidade;
    }

    public JTextField getQtdRecebida() {
        return qtdRecebida;
    }

    public JTextField getQtdMinimaRecebida() {
        return qtdMinimaRecebida;
    }

    public JTextField getCodigoBarras() {
        return codigoBarras;
    }


    public JFrame getTipoCodBarras() {
        return tipoCodBarras;
    }

    public JTextField getQtdPorCaixa() {
        return qtdPorCaixa;
    }

    public JButton getBotaoSegundoCampo() {
        return botaoSegundoCampo;
    }

    public JLabel getMarcaLabel() {
        return marcaLabel;
    }

    public JLabel getCategoriaLabel() {
        return categoriaLabel;
    }

    public JLabel getFornecedorLabel() {
        return fornecedorLabel;
    }

    public JLabel getPrecoProdLabel() {
        return precoProdLabel;
    }

    public JLabel getPrecoVendaLabel() {
        return precoVendaLabel;
    }

    public JLabel getTempoValidadeLabel() {
        return tempoValidadeLabel;
    }

    public JLabel getQtdRecebidaLabel() {
        return qtdRecebidaLabel;
    }

    public JLabel getQtdMinimaRecebidaLabel() {
        return qtdMinimaRecebidaLabel;
    }

    public JLabel getCodigoBarrasLabel() {
        return codigoBarrasLabel;
    }

    public JLabel getTipoCodigoBarrasLabel() {
        return tipoCodigoBarrasLabel;
    }

    public JLabel getQtdPorCaixaLabel() {
        return qtdPorCaixaLabel;
    }

    public JButton getSalvarPrimeiroCampo() {
        return salvarPrimeiroCampo;
    }

    public JPanel getPainelDois() {
        return painelDois;
    }

    public void setPainelDois(JPanel painelDois) {
        this.painelDois = painelDois;
    }

    public JLabel getTituloSegundoCampo() {
        return tituloSegundoCampo;
    }

    public void setCategoria(JTextField categoria) {
        this.categoria = categoria;
    }

    public void setFornecedor(JTextField fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setPrecoProd(JTextField precoProd) {
        this.precoProd = precoProd;
    }

    public void setPrecoVend(JTextField precoVend) {
        this.precoVend = precoVend;
    }

    public void setTempoValidade(JTextField tempoValidade) {
        this.tempoValidade = tempoValidade;
    }

    public void setQtdRecebida(JTextField qtdRecebida) {
        this.qtdRecebida = qtdRecebida;
    }

    public void setQtdMinimaRecebida(JTextField qtdMinimaRecebida) {
        this.qtdMinimaRecebida = qtdMinimaRecebida;
    }

    public void setCodigoBarras(JTextField codigoBarras) {
        this.codigoBarras = codigoBarras;
    }





    public void setQtdPorCaixa(JTextField qtdPorCaixa) {
        this.qtdPorCaixa = qtdPorCaixa;
    }

    public void setBotaoSegundoCampo(JButton botaoSegundoCampo) {
        this.botaoSegundoCampo = botaoSegundoCampo;
    }

    public void setMarcaLabel(JLabel marcaLabel) {
        this.marcaLabel = marcaLabel;
    }

    public void setCategoriaLabel(JLabel categoriaLabel) {
        this.categoriaLabel = categoriaLabel;
    }

    public void setFornecedorLabel(JLabel fornecedorLabel) {
        this.fornecedorLabel = fornecedorLabel;
    }

    public void setPrecoProdLabel(JLabel precoProdLabel) {
        this.precoProdLabel = precoProdLabel;
    }

    public void setPrecoVendaLabel(JLabel precoVendaLabel) {
        this.precoVendaLabel = precoVendaLabel;
    }

    public void setTempoValidadeLabel(JLabel tempoValidadeLabel) {
        this.tempoValidadeLabel = tempoValidadeLabel;
    }

    public void setQtdRecebidaLabel(JLabel qtdRecebidaLabel) {
        this.qtdRecebidaLabel = qtdRecebidaLabel;
    }

    public void setQtdMinimaRecebidaLabel(JLabel qtdMinimaRecebidaLabel) {
        this.qtdMinimaRecebidaLabel = qtdMinimaRecebidaLabel;
    }

    public void setCodigoBarrasLabel(JLabel codigoBarrasLabel) {
        this.codigoBarrasLabel = codigoBarrasLabel;
    }

    public void setTipoCodigoBarrasLabel(JLabel tipoCodigoBarrasLabel) {
        this.tipoCodigoBarrasLabel = tipoCodigoBarrasLabel;
    }

    public void setQtdPorCaixaLabel(JLabel qtdPorCaixaLabel) {
        this.qtdPorCaixaLabel = qtdPorCaixaLabel;
    }

    public void setSalvarPrimeiroCampo(JButton salvarPrimeiroCampo) {
        this.salvarPrimeiroCampo = salvarPrimeiroCampo;
    }

    public void setTituloSegundoCampo(JLabel tituloSegundoCampo) {
        this.tituloSegundoCampo = tituloSegundoCampo;
    }

    private JTextField qtdRecebida;
    private JTextField qtdMinimaRecebida;
    private JTextField codigoBarras;
    private JFrame tipoCodBarras;
    private JTextField qtdPorCaixa;
    private JButton botaoSegundoCampo;
    private JLabel marcaLabel;
    private JLabel categoriaLabel;

    private CodigoDeBarrasController codigoDeBarrasController;
    private JLabel fornecedorLabel;
    private JLabel precoProdLabel;

    private JLabel precoVendaLabel;

    private JLabel tempoValidadeLabel;

    private JLabel qtdRecebidaLabel;
    private JLabel qtdMinimaRecebidaLabel;
    private JLabel codigoBarrasLabel;
    private JLabel tipoCodigoBarrasLabel;
    private JLabel qtdPorCaixaLabel;

    public void setTipoCodBarras(JFrame tipoCodBarras) {
        this.tipoCodBarras = tipoCodBarras;
    }

    
    
    

    
    
    private JComboBox<String>comboBox ;

    private JButton salvarPrimeiroCampo;
    private JPanel painelDois;
    private JLabel tituloSegundoCampo;
    public void Configurar() {
        setTitle("Cadastro de ");
        setSize(800,700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
   public CadastroProduto() {
        Configurar();
        Alocar();
        ProdutoController controller = new ProdutoController();
        codigoDeBarrasController = new CodigoDeBarrasController();
        controller.acoes(this);
        codigoDeBarrasController.acoes(this);

        
    }

    
    
    
    
    public void Alocar(){
        setLayout(new BorderLayout());
        titulo = new JLabel("Cadastro de produtos");
        titulo.setFont(new Font("Arial",Font.BOLD,22));
        salvarPrimeiroCampo = new JButton("Salvar");
        tituloSegundoCampo = new JLabel("Leitura de código de barras");
        tituloSegundoCampo.setFont(new Font("Arial", Font.BOLD,22));
        botaoSegundoCampo = new JButton("Salvar");
        JPanel painelPrincipal = new JPanel(new GridLayout(4,1));
        painelPrincipal.add(titulo);
        marca = new JTextField(30);
        qtdMinimaRecebida = new JTextField(30);
        categoria = new JTextField(30);
        tipoCodBarras = new JFrame();
        fornecedor = new JTextField(30);
        precoProd = new JTextField(30);
        precoVend = new JTextField(30);
        marcaLabel = new JLabel("Marca");
        qtdRecebida = new JTextField(30);
        tempoValidade = new JTextField(30);
        qtdPorCaixa = new JTextField(30);
        categoriaLabel = new JLabel("Categoria");
        fornecedorLabel = new JLabel("Fornecedor");
        precoProdLabel = new JLabel("Preço do produto");
        precoVendaLabel = new JLabel("Preço para Venda");
        tempoValidadeLabel = new JLabel("Tempo de validade");
        qtdMinimaRecebidaLabel = new JLabel("Quantidade minima em estoque");
        qtdRecebidaLabel = new JLabel("Quantidade recebida");
        codigoBarras = new JTextField(30);

        campo = new JPanel(new GridLayout(10,2));
        campo.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));


        campo.add(new JLabel("Marca"));


        campo.add(marca);

        campo.add(new JLabel("Categoria"));

        campo.add(categoria);

        campo.add(new JLabel("Fornecedor"));

        campo.add(fornecedor);

        campo.add(new JLabel("Preço do produto"));

        campo.add(precoProd);


        campo.add(new JLabel("Preço para a venda"));

        campo.add(precoVend);
        campo.add(new JLabel("Tempo de validade"));

        campo.add(tempoValidade);

        campo.add(new JLabel("Quantidade recebida"));

        campo.add(qtdRecebida);

        campo.add(new JLabel("Quantidade mínima em Estoque"));

        campo.add(qtdMinimaRecebida);

        campo.add(salvarPrimeiroCampo);

        salvarPrimeiroCampo.setBackground(Color.GREEN);
        salvarPrimeiroCampo.setForeground(Color.BLACK);
        salvarPrimeiroCampo.setOpaque(true);
        salvarPrimeiroCampo.setBorderPainted(false);
        JPanel painelDoisCompleto = new JPanel(new GridLayout(4,2));
        painelDoisCompleto.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));


        painelDoisCompleto.add(new JLabel("Código de barras"));

        painelDoisCompleto.add(codigoBarras);

        painelDoisCompleto.add(new JLabel("Tipo de código de barras"));
        comboBox = new JComboBox<>();

        comboBox.addItem("Código unitário");
        comboBox.addItem("Múltiplo de embalagem");
        painelDoisCompleto.add(comboBox);






        
       
      
        painelDoisCompleto.add(new JLabel("Quantidade por caixa"));

        painelDoisCompleto.add(qtdPorCaixa);

        painelDoisCompleto.add(botaoSegundoCampo);

        botaoSegundoCampo.setBackground(Color.GREEN);
        botaoSegundoCampo.setForeground(Color.BLACK);
        botaoSegundoCampo.setOpaque(true);
        botaoSegundoCampo.setBorderPainted(false);

        JPanel painel = new JPanel();

        painel.add(painelPrincipal);
        painel.add(campo);
        painel.add(tituloSegundoCampo);
        painel.add(painelDoisCompleto);
        add(painel);
    }
}
