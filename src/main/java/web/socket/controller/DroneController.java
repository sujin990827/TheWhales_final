package web.socket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.socket.domain.App;
import web.socket.domain.Gps;
import web.socket.domain.P;
import web.socket.domain.Temp;
import web.socket.service.*;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class DroneController {
    private final GpsService gpsService;
    private final TempService tempService;
    private final PService pService;
    private final ClearService clearService;
    private final AppService appService;

    // 사용자 정보 페이지
    @PostMapping("/save/p")
    public P createP(@RequestBody P p){
        p.setPId(p.getPId());
        p.setPName(p.getPName());
        p.setPPassword(p.getPPassword());
        p.setPtime(p.getPtime());
        pService.saveP(p);
        return p;
    }

    @RequestMapping("/list")
    public List<P> getP() throws ClassNotFoundException, SQLException {
        List<P> list = pService.findP();
        return list;
    }

    //클리어 횟수 페이지
    @RequestMapping("/clear")
    public String list(@RequestParam("name") String name, Model model) {
        String clearNum = clearService.findClearNum(name);
        model.addAttribute("name", name);
        return clearNum;
    }

    //gps 페이지
    @PostMapping("/save/gps")
    public Gps createGps(@RequestBody Gps gps){
        gps.setId(gps.getId());
        gps.setLatitude(gps.getLatitude());
        gps.setLongitude(gps.getLongitude());
        LocalDateTime now = LocalDateTime.now();
        gps.setTime(now);
        gpsService.saveGps(gps);
        return gps;
    }
    @RequestMapping("/gps")
    public List<Gps> getGps() throws ClassNotFoundException, SQLException {
        List<Gps> list = gpsService.findGps();
        return list;
    }

    //온습도 오염도 페이지
    @PostMapping("/save/temp")
    public Temp createTemp(@RequestBody Temp temp){
        temp.setId(temp.getId());
        temp.setTemperature(temp.getTemperature());
        temp.setHumidity(temp.getHumidity());
        tempService.saveTemp(temp);
        return temp;
    }

    @RequestMapping("/temp")
    public List<Temp> getInfo() throws ClassNotFoundException, SQLException{
        List<Temp> list = tempService.findTemp();
        return list;
    }

    // 로그 종합 페이지
    @PostMapping("/direction")
    public App getDirection(@RequestBody App app){
        app.setDirection(app.getDirection());
        app.setSpeed(app.getSpeed());
        appService.saveApp(app);
        return app;
    }

    @RequestMapping("/direction/show")
    public List<App> showDirection() throws ClassNotFoundException, SQLException{
        List<App> list = appService.findApp();
        return list;
    }
}
