package entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "entrada")
public class Entrada {
    @Column (name = "dtEntrada")
    private Date dataEntrada;
    @Column(name = "secao")
    private Integer sessao;
    @ManyToOne
    @JoinColumn (name = "id_codbarras")
    private CodigoDeBarras codigoDeBarras;
    @ManyToOne
    @JoinColumn (name = "id_estoque")
    private Estoque estoque;
    @ManyToOne
    @JoinColumn (name = "id_login")
    private Login login;
    @OneToMany(mappedBy = "entrada", cascade = CascadeType.ALL)
    @JoinColumn(name = "id_notafiscal")
    private List<NotaFiscal> notaFiscal;


    public Entrada(Date dataEntrada, Integer sessao, CodigoDeBarras codigoDeBarras, Estoque estoque, Login login, NotaFiscal notaFiscal, Registro registro, Integer id) {
        this.dataEntrada = dataEntrada;
        this.sessao = sessao;
        this.codigoDeBarras = codigoDeBarras;
        this.estoque = estoque;
        this.login = login;
        this.registro = registro;
        this.id = id;
    }

    public Entrada(CodigoDeBarras codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Entrada(NotaFiscal notaFiscal) {
    }

    public Entrada() {
        this.notaFiscal = new ArrayList<>();
    }

    public Entrada(Date dataEntrada ) {
        this.dataEntrada = dataEntrada;


        this.notaFiscal = new ArrayList<>();
    }

    public void adicionarNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal.add(notaFiscal);
        notaFiscal.setEntrada(this);
    }

    public List<NotaFiscal> getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(List<NotaFiscal> notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Entrada(List<NotaFiscal> notaFiscal) {
        this.notaFiscal = notaFiscal;
    }




    @ManyToOne
    @JoinColumn (name = "id_registro")
    private Registro registro;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
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
