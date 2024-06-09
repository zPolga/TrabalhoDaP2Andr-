package entidades;

import javax.persistence.*;

@Entity
@Table (name= "tipo")
public class Tipo {
    @Id
    @Column (name = "id_tipo")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tipo(String descricao) {
        this.descricao = descricao;
    }

    public Tipo() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
