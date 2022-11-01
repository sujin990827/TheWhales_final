package web.socket.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Direction {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    private int a;  //좌
    private int d;  //우
}
