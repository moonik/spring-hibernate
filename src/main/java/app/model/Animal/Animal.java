package app.model.Animal;

import app.converter.ColorConverter;
import app.model.classes.Color;

import javax.persistence.Convert;
import javax.persistence.Embeddable;

@Embeddable
public class Animal {

    private String name;
    @Convert(converter = ColorConverter.class)
    private Color color;

    public Animal(){}

    public Animal(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
