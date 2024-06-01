package registro;

import login.Login;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Registro {

    @Id
    @Column (name = "id_registro")
    private Integer id;
    @Column (name = "dtacesso_entrada")
    private Date dataAccessoEntrada;

    @Column (name = "dtentrada_produto")
    private Date dataEntradaProduto;
    @Column (name = "dtsaida_produto")
    private Date dataSaidaProduto;

    @ManyToOne
    @JoinColumn(name = "id_login")
    private Login login_id;

    public Registro() {
    }

    public Registro(Integer id, Date dataAccessoEntrada, Date dataEntradaProduto, Date dataSaidaProduto, Login login_id) {
        this.id = id;
        this.dataAccessoEntrada = dataAccessoEntrada;
        this.dataEntradaProduto = dataEntradaProduto;
        this.dataSaidaProduto = dataSaidaProduto;
        this.login_id = login_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataAccessoEntrada() {
        return dataAccessoEntrada;
    }

    public void setDataAccessoEntrada(Date dataAccessoEntrada) {
        this.dataAccessoEntrada = dataAccessoEntrada;
    }

    public Date getDataEntradaProduto() {
        return dataEntradaProduto;
    }

    public void setDataEntradaProduto(Date dataEntradaProduto) {
        this.dataEntradaProduto = dataEntradaProduto;
    }

    public Date getDataSaidaProduto() {
        return dataSaidaProduto;
    }

    public void setDataSaidaProduto(Date dataSaidaProduto) {
        this.dataSaidaProduto = dataSaidaProduto;
    }



    public Login getLogin_id() {
        return login_id;
    }

    public void setLogin_id(Login login_id) {
        this.login_id = login_id;
    }
}
