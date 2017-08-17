package app.model.classes;

public enum Color {

    RED("R"),
    GREEN("G"),
    BLUE("B"),
    ERROR("E");

    private String color;

    Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static Color searchColor(String color){
        for (Color color1 : Color.values()) {
            if (color1.getColor().equals(color)) {
                return color1;
            }
        }
        return ERROR;
    }
}
