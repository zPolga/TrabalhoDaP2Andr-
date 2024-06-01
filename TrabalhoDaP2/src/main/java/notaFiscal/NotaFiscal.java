package notaFiscal;

import endereco.Endereco;
import entrada.Entrada;
import saida.Saida;

import javax.persistence.*;

@Entity
@Table (name = "notafiscal")
public class NotaFiscal {
    private String cnpj;

    public NotaFiscal() {
    }

    public NotaFiscal(String cnpj, Integer idNotaFiscal, String nomeEmpresa, Endereco endereco, Entrada entrada, Saida saida) {
        this.cnpj = cnpj;
        this.idNotaFiscal = idNotaFiscal;
        this.nomeEmpresa = nomeEmpresa;
        this.endereco = endereco;
        this.entrada = entrada;
        this.saida = saida;
    }

    @Id
    @Column (name = "id_notafiscal")
    private Integer idNotaFiscal;
    @Column (name = "nmempresa")
    private String nomeEmpresa;
    @ManyToOne
    @JoinColumn (name = "id_endereco")
    private Endereco endereco;
    @OneToOne
    private Entrada entrada;
    @OneToOne
    @JoinColumn (name = "id_saida")
    private Saida saida;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public void setIdNotaFiscal(Integer idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Saida getSaida() {
        return saida;
    }

    public void setSaida(Saida saida) {
        this.saida = saida;
    }
}
