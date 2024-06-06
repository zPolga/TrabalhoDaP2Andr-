package entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Produto {
    @Id
    @Column (name = "id_produto")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String marca;
    private String categoria;
    @Column (name = "qtde_recebida")
    private double qtdRecebida;
    @Column (name = "preco_prod")
    private double precoDoProduto;
    @Column (name = "preco_venda")
    private double precoDeVenda;
    private String fornecedor;
    @Column (name = "dtvalid_embalagem")
    private Date dataValidade;
    @Column (name = "qtde_min")
    private double quantidadeMinima;
    @ManyToOne
    @JoinColumn (name = "id_codbarras")
    private CodigoDeBarras codigoDeBarras;
    @ManyToOne
    @JoinColumn (name = "id_validade")
    private Validade validade;
    @ManyToOne
    @JoinColumn (name = "id_entrada")
    private Entrada entrada;
    @ManyToOne
    @JoinColumn (name = "id_saida")
    private Saida saida;
    @ManyToOne
    @JoinColumn (name = "id_estoque")
    private Estoque estoque;

    public Produto( String marca, String categoria, String fornecedor, double qtdRecebida, double precoDoProduto, double precoDeVenda, Date dataValidade, double quantidadeMinima) {

        this.marca = marca;
        this.categoria = categoria;
        this.qtdRecebida = qtdRecebida;
        this.precoDoProduto = precoDoProduto;
        this.precoDeVenda = precoDeVenda;
        this.fornecedor =fornecedor;
        this.dataValidade = dataValidade;
        this.quantidadeMinima = quantidadeMinima;

    }

    public Produto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getQtdRecebida() {
        return qtdRecebida;
    }

    public void setQtdRecebida(double qtdRecebida) {
        this.qtdRecebida = qtdRecebida;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(double quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public CodigoDeBarras getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(CodigoDeBarras codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Validade getValidade() {
        return validade;
    }

    public void setValidade(Validade validade) {
        this.validade = validade;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Saida getSaida() {
        return saida;
    }

    public void setSaida(Saida saida) {
        this.saida = saida;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
}
