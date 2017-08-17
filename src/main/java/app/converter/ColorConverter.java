package app.converter;

import app.model.classes.Color;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ColorConverter implements AttributeConverter<Color, String> {
    @Override
    public String convertToDatabaseColumn(Color color) {
        return color.getColor();
    }

    @Override
    public Color convertToEntityAttribute(String s) {
        return Color.searchColor(s);
    }
}
