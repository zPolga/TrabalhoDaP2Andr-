package entrada;

import codigoDeBarras.CodigoDeBarras;
import estoque.Estoque;
import login.Login;
import notaFiscal.NotaFiscal;
import registro.Registro;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Entrada {
    private Date dataEntrada;
    private Integer sessao;
    @ManyToOne
    private CodigoDeBarras codigoDeBarras;
    @ManyToOne
    private Estoque estoque;
    @ManyToOne
    private Login login;
    @OneToOne
    private NotaFiscal notaFiscal;
    @ManyToOne
    private Registro registro;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
}
