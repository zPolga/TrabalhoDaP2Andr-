package login;

import estoque.Estoque;
import funcionario.Funcionario;

import javax.persistence.*;

@Entity
public class Login {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String nome;
    private String senha;
    @OneToOne
    private Funcionario funcionario;
    @ManyToOne
    private Estoque estoque;
}
