package entidades;

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
    @JoinColumn (name = "id_estoque")
    private Estoque estoque;
    @ManyToOne
    @JoinColumn (name = "id_codbarras")
    private CodigoDeBarrasSaida codigoDeBarras;
    @ManyToOne
    @JoinColumn (name = "id_registro")
    private Registro registro;
    @ManyToOne
    @JoinColumn (name = "id_login")
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
