package entidades;

import entidades.Estado;
import entidades.Estoque;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cidade {
    @Id
    @Column (name = "id_cidade")
    private Integer id;
    private String nome;
    @ManyToOne
    @JoinColumn (name= "id_estado")
    private Estado estado;

    @OneToMany
    private List<Estoque> estoques;
    public Integer getId() {
        return id;
    }

    public List<Estoque> getEstoques() {
        return estoques;
    }

    public void setEstoques(List<Estoque> estoques) {
        this.estoques = estoques;
    }

    public Cidade() {
    }

    public Cidade(Integer id, String nome, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
