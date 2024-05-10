package codigoDeBarras;

import estoque.Estoque;
import tipo.Tipo;

import javax.persistence.*;

@Entity
public class CodigoDeBarras {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Estoque estoque;
    @ManyToOne
    private Tipo tipo;
}
