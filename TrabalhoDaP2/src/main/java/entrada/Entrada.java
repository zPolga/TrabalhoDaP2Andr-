package entrada;

import codigoDeBarras.CodigoDeBarras;
import estoque.Estoque;
import login.Login;
import notaFiscal.NotaFiscal;
import registro.Registro;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "entrada")
public class Entrada {
    @Column (name = "dtEntrada")
    private Date dataEntrada;
    @Column(name = "secao")
    private Integer sessao;
    @ManyToOne
    private CodigoDeBarras codigoDeBarras;
    @ManyToOne
    private Estoque estoque;
    @ManyToOne
    private Login login;
    @OneToOne
    private NotaFiscal notaFiscal;
    public Entrada() {
    }

    public Entrada(Date dataEntrada, Integer sessao, CodigoDeBarras codigoDeBarras, Estoque estoque, Login login, NotaFiscal notaFiscal, Registro registro, Integer id) {
        this.dataEntrada = dataEntrada;
        this.sessao = sessao;
        this.codigoDeBarras = codigoDeBarras;
        this.estoque = estoque;
        this.login = login;
        this.notaFiscal = notaFiscal;
        this.registro = registro;
        this.id = id;
    }

    @ManyToOne
    private Registro registro;
    @Id
    @Column (name = "id_entrada")
    private Integer id;

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Integer getSessao() {
        return sessao;
    }

    public void setSessao(Integer sessao) {
        this.sessao = sessao;
    }

    public CodigoDeBarras getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(CodigoDeBarras codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
