package web.socket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.socket.domain.App;
import web.socket.repository.AppRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AppService {

    private final AppRepository appRepository;

    @Transactional
    public void saveApp(App app){
            appRepository.save(app);
    }

    public List<App> findApp(){
        return appRepository.findAll();
    }
}
