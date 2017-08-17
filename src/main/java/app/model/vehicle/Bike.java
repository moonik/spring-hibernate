package app.model.vehicle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Bike extends Vehicle{
    @Column(unique = true)
    private Long number;

    public Bike(){}

    public Long getNumber() {
        return number;
    }

    public Bike(Long number) {
        this.number = number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
