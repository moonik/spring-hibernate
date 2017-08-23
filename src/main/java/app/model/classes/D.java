package app.model.classes;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class D {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ElementCollection
    private List<String> names;
    @ElementCollection
    private List<Integer> numbers;

    public D(){}

    public D(List<String> names, List<Integer> numbers) {
        this.names = names;
        this.numbers = numbers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
