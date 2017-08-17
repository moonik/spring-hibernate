package app.model.vehicle;

import app.converter.ColorConverter;
import app.model.classes.Color;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.awt.image.ColorConvertOp;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Car extends Vehicle{
    private String name;
    @Convert(converter = ColorConverter.class)
    private Color myColor;

    public Car(){}

    public Car(String name, Color myColor) {
        this.name = name;
        this.myColor = myColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getMyColor() {
        return myColor;
    }

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }
}
