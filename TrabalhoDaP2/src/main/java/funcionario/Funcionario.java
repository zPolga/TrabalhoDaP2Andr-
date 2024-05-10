package funcionario;

import endereco.Endereco;
import login.Login;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeCompleto;
    private String CPF;
    private String sexo;
    private String telefone;
    private String email;
    private Date dataAdmissao;
    private String cargo;
    private String funcao;
    private String salario;
    @ManyToOne
    private Endereco endereco;
    @OneToOne
    private Login login;

}
