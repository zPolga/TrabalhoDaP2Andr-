package entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Funcionario {
    @Id
    @Column (name = "id_funcionario")
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Column (name = "nome_completo")
    private String nomeCompleto;
    private String rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Funcionario(String nomeCompleto, String rg, String CPF, Date dtnascimento, String sexo, String email, Date dataAdmissao, String cargo, String funcao) {
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.CPF = CPF;
        this.dtnascimento = dtnascimento;
        this.sexo = sexo;
        this.email = email;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.funcao = funcao;
    }

    public Funcionario(Integer id, String nomeCompleto, String CPF, Date dtnascimento, String sexo, String telefone, String email, Date dataAdmissao, String cargo, String funcao, Double salario, Endereco endereco, Login login) {
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

    public Funcionario() {
    }

    @Column (name = "cpf")
    private String CPF;

    private Date dtnascimento;
    private String sexo;
    private String telefone;
    private String email;
    @Column (name = "dtadmissão")
    private Date dataAdmissao;
    private String cargo;
    private String funcao;
    private Double salario;
    @ManyToOne
    @JoinColumn (name = "id_endereco")
    private Endereco endereco;
    @OneToOne(mappedBy = "funcionario", cascade = CascadeType.PERSIST)
    @JoinColumn (name = "id_login")
    private Login login;

    public Integer getId() {
        return id;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
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
