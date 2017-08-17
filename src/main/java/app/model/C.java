package app.model;

import app.converter.ColorConverter;
import app.converter.LocalDateToDateConverter;
import app.converter.LocalDateToLongConverter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class C {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    @Convert(converter = LocalDateToDateConverter.class)
    private LocalDate myDate;
    @Convert(converter = LocalDateToLongConverter.class)
    private LocalDate myDate2;
    @Convert(converter = ColorConverter.class)
    private Color myColor;

    public C(){}

    public C(String name, LocalDate myDate, LocalDate myDate2, Color myColor) {
        this.name = name;
        this.myDate = myDate;
        this.myDate2 = myDate2;
        this.myColor = myColor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getMyDate() {
        return myDate;
    }

    public void setMyDate(LocalDate myDate) {
        this.myDate = myDate;
    }

    public LocalDate getMyDate2() {
        return myDate2;
    }

    public void setMyDate2(LocalDate myDate2) {
        this.myDate2 = myDate2;
    }

    public Color getMyColor() {
        return myColor;
    }

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }
}
