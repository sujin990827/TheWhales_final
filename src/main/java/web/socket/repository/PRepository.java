package web.socket.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.socket.domain.P;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(P p){
        em.persist(p);
    }

    public List<P> findAll() {
        return em.createQuery("select p from P p", P.class)
                .getResultList();
    }
}
