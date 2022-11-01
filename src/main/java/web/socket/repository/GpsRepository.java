package web.socket.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.socket.domain.Gps;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class GpsRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Gps gps){
        em.persist(gps);
    }

    //조회
    public List<Gps> findAll(){
        return em.createQuery("select g from Gps g", Gps.class)
                .getResultList();
    }
}
