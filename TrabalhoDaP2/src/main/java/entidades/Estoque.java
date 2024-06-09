package entidades;

import javax.persistence.*;

@Entity
public class Estoque {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id_estoque")
    private Integer id;

    @Column(name = "est_atual")
    private Integer estadoAtual;

    @Column(name = "est_anterior")
    private Integer estadoAnterior;

    @Column(name = "qtdesaida")
    private double qtdSaida;

    @Column(name = "qtdeEntrada")
    private double qtdEntrada;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    public Estoque() {}

    public Estoque( Integer estadoAtual, Integer estadoAnterior, double qtdSaida, double qtdEntrada) {
        this.id = id;
        this.estadoAtual = estadoAtual;
        this.estadoAnterior = estadoAnterior;
        this.qtdSaida = qtdSaida;
        this.qtdEntrada = qtdEntrada;
    }
    public Estoque(Integer estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(Integer estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public Integer getEstadoAnterior() {
        return estadoAnterior;
    }

    public void setEstadoAnterior(Integer estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    public double getQtdSaida() {
        return qtdSaida;
    }

    public void setQtdSaida(double qtdSaida) {
        this.qtdSaida = qtdSaida;
    }

    public double getQtdEntrada() {
        return qtdEntrada;
    }

    public void setQtdEntrada(double qtdEntrada) {
        this.qtdEntrada = qtdEntrada;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
