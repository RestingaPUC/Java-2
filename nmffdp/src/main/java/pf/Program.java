package pf;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pf.dominio.Pessoa;

public class Program {
    public static void main(String[] args) {
        
        Pessoa p5 = new Pessoa(null, "Aurora", "aurora@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p5);
        em.getTransaction().commit();
        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
