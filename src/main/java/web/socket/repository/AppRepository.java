package web.socket.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.socket.domain.App;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AppRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(App app){
        em.persist(app);
    }

    public List<App> findAll() {
        return em.createQuery("select p from App p", App.class)
                .getResultList();
    }
}
