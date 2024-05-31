package cidade;

import estado.Estado;

import javax.persistence.*;

@Entity
public class Cidade {
    @Id
    @Column (name = "id_cidade")
    private Integer id;
    private String nome;
    @ManyToOne

    private Estado estado;

    public Integer getId() {
        return id;
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
