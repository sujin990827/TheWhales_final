package web.socket.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.socket.domain.Direction;
import web.socket.domain.Gps;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DirRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Direction direction){
        em.persist(direction);
    }

    //조회
    public List<Direction> findAll(){
        return em.createQuery("select g from Direction g", Direction.class)
                .getResultList();
    }
}
