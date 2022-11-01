package web.socket.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class P {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id;

    private String pId;//로그인 아이디
    private String pName; //이름
    private String pPassword; //로그인 비밀번호  --> 저장소 만들어야함
    private String pClearNum;  //클리어 횟수
    private String Ptime;
}
