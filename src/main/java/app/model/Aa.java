package app.model;

import javax.persistence.*;

@Entity
public class Aa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Bb bb;

    public Aa() {
    }

    public Aa(Bb bb) {
        this.bb = bb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bb getBb() {
        return bb;
    }

    public void setBb(Bb bb) {
        this.bb = bb;
    }
}
