package endereco;

import cidade.Cidade;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String logradouro;
    private String cep;
    @ManyToOne
    private Cidade cidade;
}
