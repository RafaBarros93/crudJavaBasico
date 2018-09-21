
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enderecoCliente")
public class EnderecoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_EnderecoCliente;
    private String rua;
    private int numero;
    private String bairro;
    private String ciadade;
   

    public int getID_EnderecoCliente() {
        return ID_EnderecoCliente;
    }

    public void setID_EnderecoCliente(int ID_EnderecoCliente) {
        this.ID_EnderecoCliente = ID_EnderecoCliente;
    }

}
