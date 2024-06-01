package codigoDeBarras;

import estoque.Estoque;
import tipo.Tipo;

import javax.persistence.*;

@Entity
public class CodigoDeBarras {
    @Id
    @Column (name = "id_codbarras")
    private Integer id;
    @ManyToOne
    @JoinColumn (name = "id_estoque")
    private Estoque estoque;
    @ManyToOne
    @JoinColumn (name = "id_tipo")
    private Tipo tipo;

    public Integer getId() {
        return id;
    }

    public CodigoDeBarras() {
    }

    public CodigoDeBarras(Integer id, Estoque estoque, Tipo tipo) {
        this.id = id;
        this.estoque = estoque;
        this.tipo = tipo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
