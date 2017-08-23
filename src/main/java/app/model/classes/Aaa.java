package app.model.classes;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aaa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Bbb> bbb;

    public Aaa(){}

    public Aaa(List<Bbb> bbb) {
        this.bbb = bbb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Bbb> getBbb() {
        return bbb;
    }

    public void setBbb(List<Bbb> bbb) {
        this.bbb = bbb;
    }
}
