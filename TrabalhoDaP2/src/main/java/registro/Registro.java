package registro;

import login.Login;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Registro {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date dataAccessoEntrada;

    private Date dataEntradaProduto;
    private Date dataSaidaProduto;
    private Date dataSaidaDoProduto;
    @ManyToOne
    private Login login_id;



}
