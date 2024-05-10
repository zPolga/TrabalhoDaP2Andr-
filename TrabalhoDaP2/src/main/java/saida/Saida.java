package saida;

import codigoDeBarras.CodigoDeBarras;
import codigoDeBarrasSaida.CodigoDeBarrasSaida;
import estoque.Estoque;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Saida {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date dataSaida;
    private String motivo;
    @ManyToOne
    private Estoque estoque;
    @ManyToOne
    private CodigoDeBarrasSaida codigoDeBarras;


}
