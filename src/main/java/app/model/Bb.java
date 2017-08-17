package app.model;

import javax.persistence.*;

@Entity
public class Bb {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Aa aa;

    public Bb(){}

    public Bb(Aa aa) {
        this.aa = aa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aa getAa() {
        return aa;
    }

    public void setAa(Aa aa) {
        this.aa = aa;
    }
}
