package app.model.classes;

import javax.persistence.*;

@Entity
public class A {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private B b;

    public A(){}

    public A(B b) {
        this.b = b;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

}
