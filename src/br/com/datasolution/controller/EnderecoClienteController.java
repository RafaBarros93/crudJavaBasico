package br.com.datasolution.controller;





import br.com.datasolution.model.EnderecoCliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class EnderecoClienteController {

    EntityManagerFactory emf;
    EntityManager em;

    public EnderecoClienteController() {

        emf = Persistence.createEntityManagerFactory("cliente");
        em = emf.createEntityManager();
    }

    public void saveEnderecoCliente(EnderecoCliente _enderecoCliente) {
        em.getTransaction().begin();
        em.merge(_enderecoCliente);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteEnderecoCliente(EnderecoCliente _enderecoCliente) {
        em.getTransaction().begin();
        Query q = em.createNativeQuery("DELETE enderecocliente  from enderecocliente where cep = " + _enderecoCliente.getCep());
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }

}
