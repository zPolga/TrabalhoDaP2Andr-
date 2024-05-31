package login;

import estoque.Estoque;
import funcionario.Funcionario;

import javax.persistence.*;

@Entity
public class Login {
    @Id
    @Column (name = "id_login")
    private Integer Id;
    private String nome;
    private String senha;
    @OneToOne
    private Funcionario funcionario;
    @ManyToOne
    private Estoque estoque;

    public Login() {
    }

    public Login(Integer id, String nome, String senha, Funcionario funcionario, Estoque estoque) {
        Id = id;
        this.nome = nome;
        this.senha = senha;
        this.funcionario = funcionario;
        this.estoque = estoque;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
}
