package estoque;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estoque {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String estadoAtual;
    private String estadoAnterior;
    private double qtdSaida;
    private double qtdEntrada;

}
