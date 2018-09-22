



import java.util.List;
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
        Query q = em.createNativeQuery("DELETE cliente  from cliente where matricula = " + _cliente.getMatricula());
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }

    public List<Cliente> listCliente() {
        em.getTransaction().begin();
        Query select = em.createQuery("SELECT cliente FROM Cliente cliente");
        List<Cliente> lista = select.getResultList();
        em.getTransaction().commit();
        em.close();
        return lista;
    }
    public void updateCliente(Cliente _cliente) {
        em.getTransaction().begin();
        Query q = em.createNativeQuery("DELETE cliente  from cliente where matricula = " + _cliente.getMatricula());
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }

}
