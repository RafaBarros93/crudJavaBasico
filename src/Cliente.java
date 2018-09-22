




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Cliente;
    @Column
    private String nome;
    @Column
    private int idade;
    @Column
    private String rg_cliente;
    @Column
    private int matricula;
    @ManyToOne
    private EnderecoCliente endereco;

    public int getMatricula() {
        return matricula;
    }

    public EnderecoCliente getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCliente endereco) {
        this.endereco = endereco;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Cliente() {

    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the rg_cliente
     */
    public String getRg_cliente() {
        return rg_cliente;
    }

    /**
     * @param rg_cliente the rg_cliente to set
     */
    public void setRg_cliente(String rg_cliente) {
        this.rg_cliente = rg_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ID_Cliente=" + ID_Cliente + ", nome=" + nome + ", idade=" + idade + ", rg_cliente=" + rg_cliente + '}';
    }
}
