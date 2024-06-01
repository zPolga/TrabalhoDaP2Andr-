package validade;

import entrada.Entrada;

import javax.persistence.*;

@Entity
public class Validade {
    @Id
    @Column (name = "id_validade")
    private Integer id;
    @Column (name = "dtFabricacao")
    private String dataFabricacao;
    @ManyToOne
    @JoinColumn (name = "id_entrada")
    private Entrada entrada;

    public Validade() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
}
