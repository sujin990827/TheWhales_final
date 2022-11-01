package web.socket.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.socket.domain.Direction;
import web.socket.domain.Gps;
import web.socket.repository.DirRepository;
import web.socket.repository.GpsRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class DirService {
    private final DirRepository dirRepository;

    @Transactional
    public void saveDir(Direction direction){
        dirRepository.save(direction);
    }

    //조회
    public List<Direction> findDir(){
        return dirRepository.findAll();
    }
}
