package cidade;

import estado.Estado;

import javax.persistence.*;

@Entity
public class Cidade {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @ManyToOne
    private Estado estado;

}
