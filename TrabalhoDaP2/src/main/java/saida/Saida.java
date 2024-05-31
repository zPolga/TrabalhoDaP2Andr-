package saida;

import codigoDeBarras.CodigoDeBarras;
import codigoDeBarrasSaida.CodigoDeBarrasSaida;
import estoque.Estoque;
import login.Login;
import registro.Registro;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Saida {
    @Id
    @Column (name = "id_saida")
    private Integer id;
    @Column (name = "dtSaida")
    private Date dataSaida;

    private String motivo;
    @ManyToOne
    private Estoque estoque;
    @ManyToOne
    private CodigoDeBarrasSaida codigoDeBarras;
    @ManyToOne
    private Registro registro;
    @ManyToOne
    private Login login;

    public Saida() {
    }

    public Saida(Integer id, Date dataSaida, String motivo, Estoque estoque, CodigoDeBarrasSaida codigoDeBarras, Registro registro, Login login) {
        this.id = id;
        this.dataSaida = dataSaida;
        this.motivo = motivo;
        this.estoque = estoque;
        this.codigoDeBarras = codigoDeBarras;
        this.registro = registro;
        this.login = login;
    }

    public Integer getId() {
        return id;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public CodigoDeBarrasSaida getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(CodigoDeBarrasSaida codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }
}
