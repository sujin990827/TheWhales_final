package web.socket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.socket.domain.Temp;
import web.socket.repository.TempRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TempService {

    private final TempRepository tempRepository;

    @Transactional
    public void saveTemp(Temp temp){
        tempRepository.saveTemp(temp);
    }

    //조회
    public List<Temp> findTemp(){
        return tempRepository.findAll();
    }
}
