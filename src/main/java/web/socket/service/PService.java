package web.socket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.socket.domain.P;
import web.socket.repository.PRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PService {
    private final PRepository pRepository;

    @Transactional
    public void saveP(P p){
        pRepository.save(p);
    }

    public List<P> findP(){
        return pRepository.findAll();
    }

}
