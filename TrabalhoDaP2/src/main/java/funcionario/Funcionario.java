package funcionario;

import endereco.Endereco;
import login.Login;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Funcionario {
    @Id
    @Column (name = "id_funcionario")
    private Integer id;
    @Column (name = "mpme_completo")
    private String nomeCompleto;

    public Funcionario(Integer id, String nomeCompleto, String CPF, String dtnascimento, String sexo, String telefone, String email, Date dataAdmissao, String cargo, String funcao, String salario, Endereco endereco, Login login) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.dtnascimento = dtnascimento;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.funcao = funcao;
        this.salario = salario;
        this.endereco = endereco;
        this.login = login;
    }

    public Funcionario(String nomeCompleto, String cpf, Date dataNascimento, String endereco, String sexo, String telefone, String email, Date dataAdmissao, double salario, String cargo, String funcao) {
    }

    @Column (name = "cpf")
    private String CPF;

    private String dtnascimento;
    private String sexo;
    private String telefone;
    private String email;
    @Column (name = "dtadmissão")
    private Date dataAdmissao;
    private String cargo;
    private String funcao;
    private String salario;
    @ManyToOne
    private Endereco endereco;
    @OneToOne
    private Login login;

    public Integer getId() {
        return id;
    }

    public String getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(String dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
