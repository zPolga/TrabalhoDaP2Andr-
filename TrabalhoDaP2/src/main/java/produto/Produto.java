package produto;

import codigoDeBarras.CodigoDeBarras;
import entrada.Entrada;
import estoque.Estoque;
import saida.Saida;
import validade.Validade;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String marca;
    private String categoria;
    private double qtdRecebida;
    private double precoDoProduto;
    private double precoDeVenda;
    private String fornecedor;
    private Date dataValidade;
    private double quantidadeMinima;
    @ManyToOne
    private CodigoDeBarras codigoDeBarras;
    @ManyToOne
    private Validade validade;
    @ManyToOne
    private Entrada entrada;
    @ManyToOne
    private Saida saida;
    @ManyToOne
    private Estoque estoque;
}
