package 

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "division")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer divisionId;

    @Column(length = 255, nullable = false)
    private String divisionName;

    @OneToMany(mappedBy = "division")
    private List<Project> projects;

    public Division() {
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }
}