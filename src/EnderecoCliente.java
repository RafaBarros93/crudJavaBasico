




import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "enderecocliente")
public class EnderecoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_EnderecoCliente;
    @Column
    private String rua;
    @Column
    private int numero;
    @Column
    private String bairro;
    @Column
    private String ciadade;
    @Column
    private String cep;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "endereco")
    @JoinColumn(name = "ID_Cliente")
    private List<Cliente> enderecos;

    public List<Cliente> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Cliente> enderecos) {
        this.enderecos = enderecos;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public EnderecoCliente() {

    }

    public int getID_EnderecoCliente() {
        return ID_EnderecoCliente;
    }

    public void setID_EnderecoCliente(int ID_EnderecoCliente) {
        this.ID_EnderecoCliente = ID_EnderecoCliente;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the ciadade
     */
    public String getCiadade() {
        return ciadade;
    }

    /**
     * @param ciadade the ciadade to set
     */
    public void setCiadade(String ciadade) {
        this.ciadade = ciadade;
    }

    @Override
    public String toString() {
        return "EnderecoCliente{" + "ID_EnderecoCliente=" + ID_EnderecoCliente + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", ciadade=" + ciadade + '}';
    }

}
