package web.socket.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.socket.domain.Gps;
import web.socket.repository.GpsRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class GpsService {
    private final GpsRepository gpsRepository;

    @Transactional
    public void saveGps(Gps gps){
        gpsRepository.save(gps);
    }

    //조회
    public List<Gps> findGps(){
        return gpsRepository.findAll();
    }
}
