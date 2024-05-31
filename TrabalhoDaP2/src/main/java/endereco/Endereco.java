package endereco;

import cidade.Cidade;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @Column (name = "id_endereco")
    private Integer id;
    private String logradouro;
    private String cep;
    @ManyToOne

    private Cidade cidade;

    public Integer getId() {
        return id;
    }

    public Endereco() {
    }

    public Endereco(Integer id, String logradouro, String cep, Cidade cidade) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
