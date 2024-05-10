package validade;

import entrada.Entrada;

import javax.persistence.*;

@Entity
public class Validade {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String dataFabricacao;
    @ManyToOne
    private Entrada entrada;

}
