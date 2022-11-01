package web.socket.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class ClearRepository {

    public final EntityManager em;

    public String findOne(String name){
        return em.createQuery("select u.pClearNum from P u where u.pName = :name", String.class)
                .setParameter("name", name)
                .getResultList()
                .get(0);
    }
}
