package web.socket.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
import web.socket.domain.*;
import web.socket.service.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class DirController {
    private final DirService dirService;

    // 조종값 정보 페이지
    @PostMapping("/control/direction")
    public Direction createDir(@RequestBody Direction direction){
        direction.setD(direction.getD());
        direction.setA(direction.getA());
        dirService.saveDir(direction);
        return direction;
    }

    @RequestMapping("/control/direction")
    public List<Direction> getDir() throws ClassNotFoundException, SQLException {
        List<Direction> list = dirService.findDir();
        return list;
    }


}
