package app.model.company;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Integer salary;

    public Employee(){}

    public Employee(String name, String position, Integer salary) {
        super(name, position);
        this.salary = salary;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
