package estado;

import javax.persistence.*;

@Entity
public class Estado {
    @Id
    @Column (name = "id_estado")
    private Integer id;
    @Column (name = "nmestado")
    private String nomeEstado;
    @Column (name = "siglaestado")
    private String sigle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public Estado() {
    }

    public Estado(Integer id, String nomeEstado, String sigle) {
        this.id = id;
        this.nomeEstado = nomeEstado;
        this.sigle = sigle;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }
}
