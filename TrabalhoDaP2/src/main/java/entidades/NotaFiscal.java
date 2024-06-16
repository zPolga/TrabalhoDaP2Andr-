package entidades;

import javax.persistence.*;

@Entity
@Table (name = "notafiscal")
public class NotaFiscal {
    private String cnpj;
    private String chave;
    private String tipo;
    private String serie;
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public NotaFiscal() {
    }

    public NotaFiscal(String chave, String tipo , String serie, String numero) {
        this.chave = chave;
        this.serie = serie;
        this.tipo = tipo;
        this.numero = numero;
    }



    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id_notafiscal")
    private String idNotaFiscal;
    @Column (name = "nmempresa")
    private String nomeEmpresa;
    @ManyToOne
    @JoinColumn (name = "id_endereco")
    private Endereco endereco;
    @ManyToOne
    @JoinColumn (name ="id_entrada")
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

    public String getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public void setIdNotaFiscal(String idNotaFiscal) {
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
