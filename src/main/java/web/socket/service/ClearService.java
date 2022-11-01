package web.socket.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.socket.repository.ClearRepository;

@Service
@Transactional(readOnly = true)
public class ClearService {
    public final ClearRepository clearRepository;

    public ClearService(ClearRepository clearRepository) {
        this.clearRepository = clearRepository;
    }

    //검색

    public String findClearNum(String name){
        return clearRepository.findOne(name);
    }
}
