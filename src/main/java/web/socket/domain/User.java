package web.socket.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String LoginId;//로그인 아이디

    @NotEmpty
    private  String name; //이름

    @NotEmpty
    private String password; //로그인 비밀번호  --> 저장소 만들어야함

    private String clearNum;  //클리어 횟수
}
