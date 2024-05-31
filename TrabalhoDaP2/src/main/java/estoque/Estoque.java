package estoque;

import javax.persistence.*;

@Entity
public class Estoque {
    @Id
    @Column (name = "id_estoque")
    private Integer id;
    @Column (name = "est_atual")
    private String estadoAtual;
    @Column (name = "est_anterior")
    private String estadoAnterior;
    @Column (name = "qtdesaida")
    private double qtdSaida;
    @Column (name = "qtdeEntrada")
    private double qtdEntrada;

    public Estoque(Integer id, String estadoAtual, String estadoAnterior, double qtdSaida, double qtdEntrada) {
        this.id = id;
        this.estadoAtual = estadoAtual;
        this.estadoAnterior = estadoAnterior;
        this.qtdSaida = qtdSaida;
        this.qtdEntrada = qtdEntrada;
    }

    public Estoque() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public String getEstadoAnterior() {
        return estadoAnterior;
    }

    public void setEstadoAnterior(String estadoAnterior) {
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
}
