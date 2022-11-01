package web.socket.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Temp {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id;

    //환경정보 페이지
    private float temperature;  //온도
    private float humidity;     //습도

}
