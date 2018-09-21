
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteController {

    EntityManagerFactory emf;
    EntityManager em;

    public ClienteController() {

        emf = Persistence.createEntityManagerFactory("cliente");
        em = emf.createEntityManager();
    }

    public void saveCliente(Cliente _cliente) {
        em.getTransaction().begin();
        em.merge(_cliente);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteCliente(Cliente _cliente) {
        em.getTransaction().begin();
        Query q = em.createNamedQuery("DELETE cliente  from cliente where ID_Cliente =" + _cliente.getID_Cliente());
        em.getTransaction().commit();
        em.close();
    }

}
