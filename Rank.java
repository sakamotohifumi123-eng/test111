package 

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rank")
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rankId;

    @Column(length = 255, nullable = false, unique = true)
    private String rankName;

    @OneToMany(mappedBy = "rank")
    private List<Profile> profiles;

    public Rank() {
    }

    public Integer getRankId() {
        return rankId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }
}