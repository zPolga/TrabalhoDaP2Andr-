package notaFiscal;

import endereco.Endereco;
import entrada.Entrada;
import saida.Saida;

import javax.persistence.*;

@Entity
@Table (name = "nota_fiscal")
public class NotaFiscal {
    private String cnpj;
    @Id
    @Column (name = "id_notaFiscal")
    private Integer idNotaFiscal;
    @Column (name = "nmEmpresa")
    private String nomeEmpresa;
    @ManyToOne
    private Endereco endereco;
    @OneToOne
    private Entrada entrada;
    @OneToOne
    private Saida saida;
}
