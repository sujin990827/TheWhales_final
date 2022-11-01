package web.socket.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.socket.domain.Temp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TempRepository {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void saveTemp(Temp temp){
        em.persist(temp);
    }

    //조회
    public List<Temp> findAll(){
        return em.createQuery("select t from Temp t", Temp.class)
                .getResultList();
    }
}
