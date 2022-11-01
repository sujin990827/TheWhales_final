package web.socket.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Gps {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id;

    //GPS 페이지
    private Double latitude;  //위도
    private Double longitude; //경도
    private LocalDateTime time; //시간
}
