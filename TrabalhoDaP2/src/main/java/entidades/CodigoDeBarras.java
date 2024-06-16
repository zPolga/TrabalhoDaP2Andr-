package entidades;

import javax.persistence.*;

@Entity
@Table(name = "codbarras")
public class CodigoDeBarras {
    @Id
    @Column(name = "id_codbarras")
    private String id;

    @OneToOne
    @JoinColumn(name = "id_estoque")
    private Estoque estoque;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;

    public CodigoDeBarras() {
    }

    public CodigoDeBarras(String id,Estoque estoque, Tipo tipo) {
        this.estoque = estoque;
        this.tipo = tipo;
        this.id = id;
    }

    public CodigoDeBarras(String id) {

        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
