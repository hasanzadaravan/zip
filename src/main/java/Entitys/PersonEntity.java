package Entitys;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Getter
@Setter
@Table(name = "persons")
@Builder
@AllArgsConstructor
public class PersonEntity {

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private Date date;
    @OneToOne (cascade = CascadeType.ALL)
    private  FingerPath fingerPath;


    public PersonEntity() {

    }
}
