package app.converter;

import javax.persistence.AttributeConverter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateToLongConverter implements AttributeConverter<LocalDate, Long> {
    @Override
    public Long convertToDatabaseColumn(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String formattedString = localDate.format(formatter);
        return Long.parseLong(formattedString);
    }

    @Override
    public LocalDate convertToEntityAttribute(Long aLong) {
        LocalDate localDate = LocalDate.parse(Long.toString(aLong),
                DateTimeFormatter.ofPattern("yyyyMMdd"));
        return localDate;
    }
}
